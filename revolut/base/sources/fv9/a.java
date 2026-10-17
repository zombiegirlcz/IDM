package fv9;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.utils.gson.GsonHolder;
import com.revolut.feature.payments.messaging.data.api.model.MessageMetadata;
import fv6.n;
import iv9.l;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import rlm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f138385a = ue0.e.b(Json.d, new n(3));

    public static List a(String str) {
        if (str == null) {
            return null;
        }
        kg.o oVarA = GsonHolder.a();
        Type type = new TypeToken<List<? extends l>>() { // from class: com.revolut.feature.payments.messaging.data.impl.data.database.PaymentsChatTypeConverters$fromJsonToAgentComplimentEmbeddedEntityList$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (List) objD;
    }

    public final MessageMetadata b(String str) {
        if (str == null) {
            return null;
        }
        o oVar = this.f138385a;
        oVar.getClass();
        return (MessageMetadata) oVar.b(nlm.a.c(MessageMetadata.INSTANCE.serializer()), str);
    }

    public final String c(MessageMetadata messageMetadata) {
        if (messageMetadata == null) {
            return null;
        }
        o oVar = this.f138385a;
        oVar.getClass();
        return oVar.c(MessageMetadata.INSTANCE.serializer(), messageMetadata);
    }
}
