package u1m;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class a0 implements Serializable {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.trustdockekyc.core.backend.domain.model.d f276447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f276448c;

    public a0(String verificationId, com.trustdockekyc.core.backend.domain.model.d selectedPackage, q params) {
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        Intrinsics.checkNotNullParameter(selectedPackage, "selectedPackage");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f276446a = verificationId;
        this.f276447b = selectedPackage;
        this.f276448c = params;
    }

    public final b0 a(Context context, n2m.i activityLauncher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityLauncher, "activityLauncher");
        y yVar = b0.Companion;
        q qVar = this.f276448c;
        String str = qVar.f276498c;
        String str2 = qVar.f276496a;
        String str3 = qVar.f276497b;
        yVar.getClass();
        return new b0(this.f276446a, this.f276447b, new e0(context, new w1m.h(str), new w1m.l(str2), str3), qVar, activityLauncher);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f276446a, a0Var.f276446a) && Intrinsics.f(this.f276447b, a0Var.f276447b) && Intrinsics.f(this.f276448c, a0Var.f276448c);
    }

    public final int hashCode() {
        return this.f276448c.hashCode() + ((this.f276447b.hashCode() + (this.f276446a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SerializableSessionMetadata(verificationId=" + ((Object) ("VerificationId(value=" + this.f276446a + CoreConstants.RIGHT_PARENTHESIS_CHAR)) + ", selectedPackage=" + this.f276447b + ", params=" + this.f276448c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
