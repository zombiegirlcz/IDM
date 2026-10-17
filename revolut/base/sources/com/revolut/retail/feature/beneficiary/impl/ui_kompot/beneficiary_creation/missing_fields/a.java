package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields;

import ac4.g;
import c5j.j;
import c5j.l;
import cli.y;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import ldd.b;
import mra.d;
import n4j.i;
import oki.h;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements l {
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f99768p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d5j.a f99769q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g4j.a f99770r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n60.a f99771s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f99772t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(i modalScreenDataProvider, b focusRequesterDelegate, d5j.a definitionChangeDelegate, g4j.a dialogsExtension, n60.a keyboardControllerExtension, MissingFieldsScreenContract$InputData inputData, g stateMapper) {
        Intrinsics.checkNotNullParameter(modalScreenDataProvider, "modalScreenDataProvider");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(definitionChangeDelegate, "definitionChangeDelegate");
        Intrinsics.checkNotNullParameter(dialogsExtension, "dialogsExtension");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = modalScreenDataProvider;
        this.f99768p = focusRequesterDelegate;
        this.f99769q = definitionChangeDelegate;
        this.f99770r = dialogsExtension;
        this.f99771s = keyboardControllerExtension;
        this.f99772t = d.b(this, new j(inputData.f99762a, inputData.f99763b, 0), stateMapper, null, false, 12);
        this.u = e.a(this, new bwd.a(this, 21));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f99772t;
    }
}
