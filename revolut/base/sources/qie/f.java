package qie;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qc0.e1;
import vkm.y;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk0.a f246700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hlm.c f246701b;

    static {
        Intrinsics.checkNotNullParameter("CREDIT_TAB_VISIBILITY", "id");
    }

    public f(mk0.a personalisationStorage) {
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        this.f246700a = personalisationStorage;
        this.f246701b = hlm.d.a();
    }

    public final y b() {
        return new y(new e1(this, null, 13), this.f246700a.j(new tk0.b("CREDIT_TAB_VISIBILITY")));
    }
}
