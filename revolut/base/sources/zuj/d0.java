package zuj;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class d0 implements cli.n {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ozb.b f325491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd0.b f325492b;

    public d0(ozb.b logoUIMapper, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(logoUIMapper, "logoUIMapper");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f325491a = logoUIMapper;
        this.f325492b = languageProvider;
    }

    public static Custom a(puj.d dVar) {
        int i = c0.f325489a[dVar.ordinal()];
        if (i == 1) {
            return new Custom(Integer.valueOf(R$attr.uikit_colorGreen), false, null, false, null, 254);
        }
        if (i == 2) {
            return new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254);
        }
        if (i == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        n domainState = (n) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (w) iii.c.f(domainState.f325497a, new zr2.o(this, 24), new zs4.d(this, 5), new zhl.l(this, domainState, 10));
    }
}
