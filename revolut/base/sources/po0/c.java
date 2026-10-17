package po0;

import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements l {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f237844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f237845b;

    public c(int i) {
        this.f237844a = new s(i, i, i, Float.valueOf(0.38f));
        this.f237845b = i;
    }

    @Override // po0.l
    public final int a(boolean z) {
        return this.f237844a.a(z);
    }

    @Override // po0.l
    public final LottieImage b(boolean z, boolean z3) {
        return this.f237844a.b(z, z3);
    }

    @Override // po0.l
    public final Integer c() {
        return Integer.valueOf(this.f237844a.e);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f237845b == ((c) obj2).f237845b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f237845b);
    }
}
