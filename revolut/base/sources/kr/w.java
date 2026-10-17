package kr;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class w {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f188593b = {yhm.j.c(yhm.k.PUBLICATION, new kl7.w0(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f188594a;

    public /* synthetic */ w(int i, List list) {
        if (1 == (i & 1)) {
            this.f188594a = list;
        } else {
            qlm.j1.f(u.f188586a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f188594a, ((w) obj2).f188594a);
    }

    public final int hashCode() {
        return this.f188594a.hashCode();
    }

    public w(ArrayList frameAnalysisResults) {
        Intrinsics.checkNotNullParameter(frameAnalysisResults, "frameAnalysisResults");
        this.f188594a = frameAnalysisResults;
    }
}
