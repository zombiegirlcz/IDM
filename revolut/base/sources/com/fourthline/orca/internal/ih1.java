package com.fourthline.orca.internal;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ih1 {
    private static final hh1 a(jh1 jh1Var, Json json) {
        h6 h6Var;
        Object next;
        yz yzVar;
        Object next2;
        g10 g10Var;
        Object next3;
        gx0 gx0Var;
        Object next4;
        String onboardingStatus = jh1Var.getOnboardingStatus();
        Iterator it8 = jh1Var.getModuleStatuses().iterator();
        while (true) {
            h6Var = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((qb1) next).getName(), "Workflow")) {
                break;
            }
        }
        qb1 qb1Var = (qb1) next;
        if (qb1Var != null) {
            JsonObject value = qb1Var.getValue();
            json.getClass();
            yzVar = (yz) json.a(nlm.a.c(yz.INSTANCE.serializer()), value);
        } else {
            yzVar = null;
        }
        Iterator it9 = jh1Var.getModuleStatuses().iterator();
        while (true) {
            if (!it9.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it9.next();
            if (Intrinsics.f(((qb1) next2).getName(), "IdentityVerification")) {
                break;
            }
        }
        qb1 qb1Var2 = (qb1) next2;
        if (qb1Var2 != null) {
            JsonObject value2 = qb1Var2.getValue();
            json.getClass();
            g10Var = (g10) json.a(nlm.a.c(g10.INSTANCE.serializer()), value2);
        } else {
            g10Var = null;
        }
        Iterator it10 = jh1Var.getModuleStatuses().iterator();
        while (true) {
            if (!it10.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it10.next();
            if (Intrinsics.f(((qb1) next3).getName(), "QualifiedElectronicSignature")) {
                break;
            }
        }
        qb1 qb1Var3 = (qb1) next3;
        if (qb1Var3 != null) {
            JsonObject value3 = qb1Var3.getValue();
            json.getClass();
            gx0Var = (gx0) json.a(nlm.a.c(gx0.INSTANCE.serializer()), value3);
        } else {
            gx0Var = null;
        }
        Iterator it11 = jh1Var.getModuleStatuses().iterator();
        while (true) {
            if (!it11.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it11.next();
            if (Intrinsics.f(((qb1) next4).getName(), "BankAccountVerification")) {
                break;
            }
        }
        qb1 qb1Var4 = (qb1) next4;
        if (qb1Var4 != null) {
            JsonObject value4 = qb1Var4.getValue();
            json.getClass();
            h6Var = (h6) json.a(nlm.a.c(h6.INSTANCE.serializer()), value4);
        }
        return new hh1(onboardingStatus, yzVar, g10Var, gx0Var, h6Var);
    }

    public static final hh1 a(Json json, String content) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        json.getClass();
        return a((jh1) json.b(jh1.INSTANCE.serializer(), content), json);
    }
}
