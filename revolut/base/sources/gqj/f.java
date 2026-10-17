package gqj;

import java.text.SimpleDateFormat;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements mzi.a {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f145754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f145755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f145756c;
    public final Lazy d;

    public f(qd0.b languageProvider, t70.g localization) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f145754a = languageProvider;
        final int i = 0;
        this.f145755b = j.b(new Function0(this) { // from class: gqj.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f145753b;

            {
                this.f145753b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new SimpleDateFormat("LLLL", ((s80.b) this.f145753b.f145754a).b());
                    case 1:
                        return new SimpleDateFormat("MMM", ((s80.b) this.f145753b.f145754a).b());
                    default:
                        return new SimpleDateFormat("yy", ((s80.b) this.f145753b.f145754a).b());
                }
            }
        });
        final int i2 = 1;
        this.f145756c = j.b(new Function0(this) { // from class: gqj.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f145753b;

            {
                this.f145753b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new SimpleDateFormat("LLLL", ((s80.b) this.f145753b.f145754a).b());
                    case 1:
                        return new SimpleDateFormat("MMM", ((s80.b) this.f145753b.f145754a).b());
                    default:
                        return new SimpleDateFormat("yy", ((s80.b) this.f145753b.f145754a).b());
                }
            }
        });
        final int i3 = 2;
        this.d = j.b(new Function0(this) { // from class: gqj.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f145753b;

            {
                this.f145753b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return new SimpleDateFormat("LLLL", ((s80.b) this.f145753b.f145754a).b());
                    case 1:
                        return new SimpleDateFormat("MMM", ((s80.b) this.f145753b.f145754a).b());
                    default:
                        return new SimpleDateFormat("yy", ((s80.b) this.f145753b.f145754a).b());
                }
            }
        });
    }
}
