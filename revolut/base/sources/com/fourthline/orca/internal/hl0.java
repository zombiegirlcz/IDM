package com.fourthline.orca.internal;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class hl0 implements gl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gj f29324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yj0 f29325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ce1 f29326c;
    private final List d;
    private final di e;

    public hl0(gj documentBundle, yj0 personBundleByPriority, ce1 stringExtractor, List countries, di diVar) {
        Intrinsics.checkNotNullParameter(documentBundle, "documentBundle");
        Intrinsics.checkNotNullParameter(personBundleByPriority, "personBundleByPriority");
        Intrinsics.checkNotNullParameter(stringExtractor, "stringExtractor");
        Intrinsics.checkNotNullParameter(countries, "countries");
        this.f29324a = documentBundle;
        this.f29325b = personBundleByPriority;
        this.f29326c = stringExtractor;
        this.d = countries;
        this.e = diVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(fd fdVar, hl0 hl0Var) {
        return fdVar.e() + " " + hl0Var.f29326c.a(fdVar.f());
    }

    @Override // com.fourthline.orca.internal.gl0
    public di c() {
        return this.e;
    }

    @Override // com.fourthline.orca.internal.p40
    public a01 d() {
        fd fdVarK = k();
        if (fdVarK != null) {
            return new kl0(fdVarK, fdVarK.f(), new rj1(fdVarK, this, 22));
        }
        return null;
    }

    @Override // com.fourthline.orca.internal.gl0
    public fd k() {
        Object next;
        Iterator it8 = b().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((fd) next).c(), this.f29325b.o())) {
                break;
            }
        }
        return (fd) next;
    }

    @Override // com.fourthline.orca.internal.gl0
    public List b() {
        return this.d;
    }

    public /* synthetic */ hl0(gj gjVar, yj0 yj0Var, ce1 ce1Var, List list, di diVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(gjVar, yj0Var, ce1Var, list, (i & 16) != 0 ? gjVar.o() : diVar);
    }
}
