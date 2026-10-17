package com.revolut.feature.subaccount.impl.ui.create.flow.group;

import ang.f;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import s7e.e;
import yki.i;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends h implements s7e.b {

    @NotNull
    public static final e Companion = new e();
    public static final Set u;
    public final ContactsPickerFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ln3.b f89010p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f89011q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mre.c f89012r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l61.a f89013s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f89014t;

    static {
        wi0.a aVar = wi0.b.Companion;
        aVar.getClass();
        wi0.b bVar = wi0.b.X0;
        aVar.getClass();
        wi0.b bVar2 = wi0.b.Y1;
        aVar.getClass();
        wi0.b bVar3 = wi0.b.O;
        aVar.getClass();
        wi0.b bVar4 = wi0.b.M0;
        aVar.getClass();
        wi0.b[] elements = {bVar, bVar2, bVar3, bVar4, wi0.b.i};
        Intrinsics.checkNotNullParameter(elements, "elements");
        u = d.y0(elements);
    }

    public c(ContactsPickerFlowContract$InputData inputData, ln3.b contactsChooserNavigationProvider, f userInteractor, mre.c termsNavigationFactory, l61.a userCompanyInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(contactsChooserNavigationProvider, "contactsChooserNavigationProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.o = inputData;
        this.f89010p = contactsChooserNavigationProvider;
        this.f89011q = userInteractor;
        this.f89012r = termsNavigationFactory;
        this.f89013s = userCompanyInteractor;
        this.f89014t = d8l.d.a(this, new s42.f(this, 15));
    }

    @Override // yki.j
    public final void M0() {
        l2(new s64.a(this, null, 4), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f89014t;
    }
}
