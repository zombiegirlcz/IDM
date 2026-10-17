package com.revolut.feature.retail.restaurants.impl.ui.customerdetails;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.restaurants.impl.domain.model.Customer;
import deb.b;
import deb.j;
import deb.k;
import deb.m;
import fj0.c;
import hx7.e;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import mra.d;
import oki.h;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements k {
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zzl.b f82844p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final phm.a f82845q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f82846r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f82847s;

    public a(CustomerDetailsScreenContract$InputData inputData, b phoneMapper, zzl.b regexMatcher, phm.a pickerControllerInteractor, m stateMapper) {
        Object objA;
        String string;
        Object objA2;
        Object objA3;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(phoneMapper, "phoneMapper");
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        Intrinsics.checkNotNullParameter(pickerControllerInteractor, "pickerControllerInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = phoneMapper;
        this.f82844p = regexMatcher;
        this.f82845q = pickerControllerInteractor;
        Customer customer = inputData.f82841a;
        String str = customer != null ? customer.f82801a : null;
        String str2 = customer != null ? customer.f82802b : null;
        String str3 = customer != null ? customer.f82803c : null;
        String str4 = customer != null ? customer.d : null;
        Data data = new Data(str, str != null ? J2(str, new CustomerDetailsScreenContract$ValidationError$FirstNameIsBlank()) : null, false, 4, null);
        String str5 = str4;
        Data data2 = new Data(str2, str2 != null ? J2(str2, new CustomerDetailsScreenContract$ValidationError$LastNameIsBlank()) : null, false, 4, null);
        z80.b bVar = phoneMapper.f113349a;
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = bVar.f();
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = o.a(th10);
        }
        wi0.b bVar2 = (wi0.b) (objA instanceof n ? null : objA);
        if (bVar2 == null) {
            wi0.b.Companion.getClass();
            bVar2 = wi0.b.p0;
        }
        fj0.b bVarB = phoneMapper.b(bVar2);
        j jVar = bVarB != null ? new j(bVarB.f135518a, new Data(null, null, false, 7, null), bVar2) : null;
        if (jVar == null) {
            Data data3 = new Data(null, null, false, 7, null);
            wi0.b.Companion.getClass();
            wi0.b bVar3 = wi0.b.p0;
            fj0.b.Companion.getClass();
            Serializable serializableA = fj0.a.a(44);
            o.b(serializableA);
            jVar = new j(((fj0.b) serializableA).f135518a, data3, bVar3);
        }
        wi0.b bVar4 = jVar.f113358b;
        if (str3 != null && (string = d0.F0(str3).toString()) != null) {
            if (d0.W(string)) {
                jVar = j.b(jVar, new Data("", null, false, 6, null));
            } else {
                try {
                    objA2 = bVar.m(string, bVar4.f297794a);
                } catch (Throwable th11) {
                    m.Companion companion3 = yhm.m.INSTANCE;
                    objA2 = o.a(th11);
                }
                c cVar = (c) (objA2 instanceof n ? null : objA2);
                if (cVar == null) {
                    jVar = b.c(jVar, string);
                } else {
                    if (a0.H(string, "+", false) || a0.H(string, "00", false)) {
                        try {
                            objA3 = bVar.e(string);
                        } catch (Throwable th12) {
                            m.Companion companion4 = yhm.m.INSTANCE;
                            objA3 = o.a(th12);
                        }
                        bVar4 = (wi0.b) (objA3 instanceof n ? null : objA3);
                    }
                    if (bVar4 == null) {
                        jVar = b.c(jVar, string);
                    } else {
                        fj0.a aVar = fj0.b.Companion;
                        int i = cVar.f135519a;
                        aVar.getClass();
                        Serializable serializableA2 = fj0.a.a(i);
                        fj0.b bVar5 = (fj0.b) (serializableA2 instanceof n ? null : serializableA2);
                        jVar = bVar5 != null ? new j(bVar5.f135518a, phoneMapper.a(cVar.f135520b, bVar4), bVar4) : b.c(jVar, string);
                    }
                }
            }
        }
        j jVar2 = jVar;
        Data data4 = new Data(str5, str5 != null ? I2(str5) : null, false, 4, null);
        String str6 = inputData.f82842b;
        this.f82846r = d.b(this, new deb.h(data, data2, jVar2, data4, str6 == null ? "" : str6), stateMapper, null, false, 12);
        this.f82847s = e.a(this, new cwj.h(this, 24));
    }

    public static Throwable J2(String str, Throwable th10) {
        if (d0.W(d0.F0(str).toString())) {
            return th10;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [com.revolut.feature.retail.restaurants.impl.ui.customerdetails.CustomerDetailsScreenContract$ValidationError$EmailIsInvalid] */
    public final CustomerDetailsScreenContract$ValidationError$EmailIsInvalid I2(String str) {
        String string = d0.F0(str).toString();
        if (d0.W(string) || !((zzl.c) this.f82844p).a("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$", string)) {
            return new Throwable() { // from class: com.revolut.feature.retail.restaurants.impl.ui.customerdetails.CustomerDetailsScreenContract$ValidationError$EmailIsInvalid
            };
        }
        return null;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f82847s;
    }

    @Override // cli.z
    public final g getState() {
        return this.f82846r;
    }
}
