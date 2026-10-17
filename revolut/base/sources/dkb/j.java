package dkb;

import cli.n;
import cli.o;
import dee.a0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f115500a = v.k("https://assets.revolut.com/mobile/savings/challenge/onboarding/contribution/01_light.mp4", "https://assets.revolut.com/mobile/savings/challenge/onboarding/contribution/02_light.mp4", "https://assets.revolut.com/mobile/savings/challenge/onboarding/contribution/03_light.mp4", "https://assets.revolut.com/mobile/savings/challenge/onboarding/contribution/04_light.mp4", "https://assets.revolut.com/mobile/savings/challenge/onboarding/contribution/05_light.mp4");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f115501b = v.k("https://assets.revolut.com/mobile/savings/challenge/onboarding/contribution/01_dark.mp4", "https://assets.revolut.com/mobile/savings/challenge/onboarding/contribution/02_dark.mp4", "https://assets.revolut.com/mobile/savings/challenge/onboarding/contribution/03_dark.mp4", "https://assets.revolut.com/mobile/savings/challenge/onboarding/contribution/04_dark.mp4", "https://assets.revolut.com/mobile/savings/challenge/onboarding/contribution/05_dark.mp4");

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (g) iii.c.f(domainState.f115494a, new dg3.d(this, 19), new a0(23), new dbg.b(this, domainState, 3));
    }
}
