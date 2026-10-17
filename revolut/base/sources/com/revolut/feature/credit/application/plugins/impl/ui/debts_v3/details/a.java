package com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details;

import cli.y;
import hx7.e;
import i3g.k;
import j2c.n;
import j94.f;
import j94.g;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import my3.j;
import my3.m;
import my3.o;
import oki.h;
import w80.b;
import yhm.m;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements g {
    public final DebtDetailsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f67505p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yw3.a f67506q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i94.b f67507r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l94.b f67508s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f67509t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(DebtDetailsControllerContract$InputData inputData, b amountFormatter, yw3.a interactor, i94.b actionDialogMapper, l94.b dropdownPickerMapper, k stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(actionDialogMapper, "actionDialogMapper");
        Intrinsics.checkNotNullParameter(dropdownPickerMapper, "dropdownPickerMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f67505p = amountFormatter;
        this.f67506q = interactor;
        this.f67507r = actionDialogMapper;
        this.f67508s = dropdownPickerMapper;
        this.f67509t = d.b(this, new f(inputData.f67503c.f), stateMapper, null, false, 12);
        this.u = e.a(this, new n(this, 18));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o I2(o oVar, String str) {
        Object objA;
        if (oVar instanceof j) {
            j jVar = (j) oVar;
            int i = 0;
            while (true) {
                if (i >= str.length()) {
                    break;
                }
                if (Character.isDigit(str.charAt(i))) {
                    xi0.b bVar = jVar.f210324g;
                    dVar = new dj0.d(this.f67505p.b(str, bVar.f306286a), bVar);
                    break;
                }
                i++;
            }
            dj0.d dVar = dVar;
            String id10 = jVar.f210321a;
            boolean z = jVar.f210322b;
            boolean z3 = jVar.f210323c;
            String label = jVar.d;
            String str2 = jVar.f;
            xi0.b currency = jVar.f210324g;
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(currency, "currency");
            return new j(id10, z, z3, label, dVar, str2, currency);
        }
        if (oVar instanceof my3.n) {
            my3.n nVar = (my3.n) oVar;
            String id11 = nVar.f210334a;
            boolean z4 = nVar.f210335b;
            boolean z6 = nVar.f210336c;
            String label2 = nVar.d;
            String str3 = nVar.f;
            m picker = nVar.f210337g;
            Intrinsics.checkNotNullParameter(id11, "id");
            Intrinsics.checkNotNullParameter(label2, "label");
            Intrinsics.checkNotNullParameter(picker, "picker");
            return new my3.n(id11, z4, z6, label2, str, str3, picker);
        }
        if (!(oVar instanceof my3.k)) {
            throw new NoWhenBranchMatchedException();
        }
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.getDefault());
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = LocalDate.parse(str, dateTimeFormatterOfPattern);
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        dVar = objA instanceof yhm.n ? null : objA;
        my3.k kVar = (my3.k) oVar;
        String id12 = kVar.f210325a;
        boolean z11 = kVar.f210326b;
        boolean z12 = kVar.f210327c;
        String label3 = kVar.d;
        String str4 = kVar.f;
        String initialTextValue = kVar.f210328g;
        Intrinsics.checkNotNullParameter(id12, "id");
        Intrinsics.checkNotNullParameter(label3, "label");
        Intrinsics.checkNotNullParameter(initialTextValue, "initialTextValue");
        return new my3.k(id12, z11, z12, label3, (LocalDate) dVar, str4, initialTextValue);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f67509t;
    }
}
