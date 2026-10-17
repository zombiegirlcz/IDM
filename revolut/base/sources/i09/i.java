package i09;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends com.revolut.feature.learn.shared.impl.ui.course.overview.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f157326a;

    public i(int i) {
        this.f157326a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f157326a == ((i) obj2).f157326a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f157326a);
    }
}
