package sl;

import com.onfido.android.sdk.capture.ui.options.MotionCaptureVariantOptions;
import com.onfido.api.client.token.sdk.ApplicantId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class o implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MotionCaptureVariantOptions f264056c;
    public final ApplicantId d;

    public o(String id10, String taskDefId, MotionCaptureVariantOptions options, ApplicantId applicantId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(taskDefId, "taskDefId");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(applicantId, "applicantId");
        this.f264054a = id10;
        this.f264055b = taskDefId;
        this.f264056c = options;
        this.d = applicantId;
    }

    @Override // sl.x
    public final String a() {
        return this.f264055b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f264054a, oVar.f264054a) && Intrinsics.f(this.f264055b, oVar.f264055b) && Intrinsics.f(this.f264056c, oVar.f264056c) && Intrinsics.f(this.d, oVar.d);
    }

    @Override // sl.x
    public final String getId() {
        return this.f264054a;
    }

    public final int hashCode() {
        return this.d.f50154a.hashCode() + ((this.f264056c.hashCode() + p.a.c(this.f264054a.hashCode() * 31, 31, this.f264055b)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = v0.a.m("FaceMotionTask(id=", this.f264054a, ", taskDefId=", this.f264055b, ", options=");
        sbM.append(this.f264056c);
        sbM.append(", applicantId=");
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }
}
