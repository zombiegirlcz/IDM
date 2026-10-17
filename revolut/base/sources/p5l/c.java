package p5l;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f233194b = new c(new d(new a(f0.f322471a)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f233195a;

    public c(d ui) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f233195a = ui;
    }

    public final List a() {
        return this.f233195a.f233196a.f233193a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f233195a, ((c) obj2).f233195a);
    }

    public final int hashCode() {
        return this.f233195a.hashCode();
    }
}
