package ok;

import com.meshconnect.link.entity.AccessTokenResponse;
import com.meshconnect.link.entity.DelayedAuthResponse;
import com.meshconnect.link.entity.JsError;
import com.meshconnect.link.entity.JsType;
import com.meshconnect.link.entity.LinkEvent;
import com.meshconnect.link.entity.TransferFinishedResponse;
import com.meshconnect.link.entity.Type;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b {
    public static LinkEvent a(String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        lk.a aVar = lk.a.f196159a;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(JsType.class, "classOfT");
        Type type = ((JsType) lk.a.a().c(json, JsType.class)).getType();
        switch (type == null ? -1 : a.f225852a[type.ordinal()]) {
            case 1:
                return LinkEvent.Close.INSTANCE;
            case 2:
                return LinkEvent.Done.INSTANCE;
            case 3:
                return LinkEvent.ShowClose.INSTANCE;
            case 4:
                return LinkEvent.Loaded.INSTANCE;
            case 5:
                Intrinsics.checkNotNullParameter(json, "json");
                Intrinsics.checkNotNullParameter(AccessTokenResponse.class, "classOfT");
                return new LinkEvent.Payload(((AccessTokenResponse) lk.a.a().c(json, AccessTokenResponse.class)).getPayload());
            case 6:
                Intrinsics.checkNotNullParameter(json, "json");
                Intrinsics.checkNotNullParameter(TransferFinishedResponse.class, "classOfT");
                return new LinkEvent.Payload(((TransferFinishedResponse) lk.a.a().c(json, TransferFinishedResponse.class)).getPayload());
            case 7:
                Intrinsics.checkNotNullParameter(json, "json");
                Intrinsics.checkNotNullParameter(DelayedAuthResponse.class, "classOfT");
                return new LinkEvent.Payload(((DelayedAuthResponse) lk.a.a().c(json, DelayedAuthResponse.class)).getPayload());
            case 8:
                Intrinsics.checkNotNullParameter(json, "json");
                Intrinsics.checkNotNullParameter(JsError.class, "classOfT");
                String errorMessage = ((JsError) lk.a.a().c(json, JsError.class)).getErrorMessage();
                if (errorMessage == null) {
                    errorMessage = "Error is not defined";
                }
                throw new IllegalStateException(errorMessage.toString());
            case 9:
                Intrinsics.checkNotNullParameter(json, "json");
                Object objD = lk.a.a().d(json, new com.meshconnect.link.b.a().getType());
                Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
                Map map = (Map) objD;
                return new LinkEvent.TrueAuth(String.valueOf(map.get("link")), String.valueOf(map.get("atomicToken")));
            default:
                return null;
        }
    }
}
