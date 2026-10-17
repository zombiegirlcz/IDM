package hh3;

import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f152245a;

    public c(ImmutableMap uiBlockMappers) {
        Intrinsics.checkNotNullParameter(uiBlockMappers, "uiBlockMappers");
        this.f152245a = uiBlockMappers;
    }

    public HashMap a(Collection collection) {
        Set setUnmodifiableSet;
        HashMap map = new HashMap();
        Map map2 = this.f152245a;
        for (String str : map2.keySet()) {
            if (map2.containsKey(str)) {
                HashSet hashSet = new HashSet();
                for (Map.Entry entry : ((Map) map2.get(str)).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add((String) entry.getValue());
                    }
                }
                setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            } else {
                setUnmodifiableSet = Collections.EMPTY_SET;
            }
            map.put(str, setUnmodifiableSet);
        }
        return map;
    }

    public c(Map providersByKind, int i) {
        switch (i) {
            case 2:
                this.f152245a = providersByKind;
                break;
            default:
                Intrinsics.checkNotNullParameter(providersByKind, "providersByKind");
                this.f152245a = providersByKind;
                break;
        }
    }
}
