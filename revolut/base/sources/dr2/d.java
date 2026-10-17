package dr2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xq2.c f117074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f117075b;

    public d(xq2.c processingState, f labelContent) {
        Intrinsics.checkNotNullParameter(processingState, "processingState");
        Intrinsics.checkNotNullParameter(labelContent, "labelContent");
        this.f117074a = processingState;
        this.f117075b = labelContent;
    }

    public static d a(d dVar, xq2.c processingState, f labelContent, int i) {
        if ((i & 1) != 0) {
            processingState = dVar.f117074a;
        }
        if ((i & 2) != 0) {
            labelContent = dVar.f117075b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(processingState, "processingState");
        Intrinsics.checkNotNullParameter(labelContent, "labelContent");
        return new d(processingState, labelContent);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f117074a, dVar.f117074a) && Intrinsics.f(this.f117075b, dVar.f117075b);
    }

    public final int hashCode() {
        return this.f117075b.hashCode() + (this.f117074a.hashCode() * 31);
    }
}
