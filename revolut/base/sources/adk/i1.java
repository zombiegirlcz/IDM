package adk;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i1 implements rlm.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String[] f3398b;

    public i1(String[] names, int i) {
        this.f3397a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(names, "names");
                this.f3398b = names;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(names, "names");
                this.f3398b = names;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(names, "names");
                this.f3398b = names;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(names, "names");
                this.f3398b = names;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(names, "names");
                this.f3398b = names;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(names, "names");
                this.f3398b = names;
                break;
            default:
                Intrinsics.checkNotNullParameter(names, "names");
                this.f3398b = names;
                break;
        }
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        switch (this.f3397a) {
        }
        return rlm.r.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj2) {
        switch (this.f3397a) {
            case 0:
                if ((obj2 instanceof rlm.r) && Arrays.equals(names(), ((rlm.r) obj2).names())) {
                }
                break;
            case 1:
                if ((obj2 instanceof rlm.r) && Arrays.equals(names(), ((rlm.r) obj2).names())) {
                }
                break;
            case 2:
                if ((obj2 instanceof rlm.r) && Arrays.equals(names(), ((rlm.r) obj2).names())) {
                }
                break;
            case 3:
                if ((obj2 instanceof rlm.r) && Arrays.equals(names(), ((rlm.r) obj2).names())) {
                }
                break;
            case 4:
                if ((obj2 instanceof rlm.r) && Arrays.equals(names(), ((rlm.r) obj2).names())) {
                }
                break;
            case 5:
                if ((obj2 instanceof rlm.r) && Arrays.equals(names(), ((rlm.r) obj2).names())) {
                }
                break;
            default:
                if ((obj2 instanceof rlm.r) && Arrays.equals(names(), ((rlm.r) obj2).names())) {
                }
                break;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        int iHashCode;
        switch (this.f3397a) {
            case 0:
                iHashCode = Arrays.hashCode(this.f3398b);
                break;
            case 1:
                iHashCode = Arrays.hashCode(this.f3398b);
                break;
            case 2:
                iHashCode = Arrays.hashCode(this.f3398b);
                break;
            case 3:
                iHashCode = Arrays.hashCode(this.f3398b);
                break;
            case 4:
                iHashCode = Arrays.hashCode(this.f3398b);
                break;
            case 5:
                iHashCode = Arrays.hashCode(this.f3398b);
                break;
            default:
                iHashCode = Arrays.hashCode(this.f3398b);
                break;
        }
        return iHashCode ^ 397397176;
    }

    @Override // rlm.r
    public final /* synthetic */ String[] names() {
        switch (this.f3397a) {
        }
        return this.f3398b;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        switch (this.f3397a) {
        }
        return p.a.p("@kotlinx.serialization.json.JsonNames(names=", Arrays.toString(this.f3398b), ")");
    }
}
