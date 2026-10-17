package i1m;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class e {
    public static f a(HashMap storedState) {
        Intrinsics.checkNotNullParameter(storedState, "storedState");
        Object obj2 = storedState.get("firstEventId");
        if (obj2 instanceof String) {
            Object obj3 = storedState.get("firstEventTimestamp");
            if (obj3 instanceof String) {
                Object obj4 = storedState.get("sessionId");
                if (obj4 instanceof String) {
                    Object obj5 = storedState.get("previousSessionId");
                    if (!(obj5 instanceof String)) {
                        obj5 = null;
                    }
                    String str = obj5 instanceof String ? (String) obj5 : null;
                    Object obj6 = storedState.get("sessionIndex");
                    if (obj6 instanceof Integer) {
                        Object obj7 = storedState.get("userId");
                        if (obj7 instanceof String) {
                            Object obj8 = storedState.get("storageMechanism");
                            if (obj8 instanceof String) {
                                Object obj9 = storedState.get("eventIndex");
                                Integer num = obj9 instanceof Integer ? (Integer) obj9 : null;
                                Object obj10 = storedState.get("lastUpdate");
                                return new f((String) obj2, (String) obj3, (String) obj4, str, ((Number) obj6).intValue(), (String) obj7, (String) obj8, num, obj10 instanceof Long ? (Long) obj10 : null);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
