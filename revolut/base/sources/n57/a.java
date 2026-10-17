package n57;

import com.revolut.feature.devicemanagement.impl.data.service.DeviceManagementService;
import e4m.e;
import ecm.q;
import java.util.Set;
import je0.d;
import k18.c;
import kotlin.jvm.internal.Intrinsics;
import mga.f0;
import mga.i0;
import n86.i;
import n86.k;
import os2.g;
import pa6.w;
import retrofit2.Retrofit;
import rga.h;
import rga.p;
import vc.s;
import wli.x;
import xn.b;
import y96.f;
import yji.n;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements e {
    public static p A(c factory, ln.a navigationCommandsDispatcher, wm.e expandableDialogActionDispatcher, g viewableRecordItemCollectorFactory, b adsTrackingInteractor) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(expandableDialogActionDispatcher, "expandableDialogActionDispatcher");
        Intrinsics.checkNotNullParameter(viewableRecordItemCollectorFactory, "viewableRecordItemCollectorFactory");
        Intrinsics.checkNotNullParameter(adsTrackingInteractor, "adsTrackingInteractor");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(expandableDialogActionDispatcher, "expandableDialogActionDispatcher");
        Intrinsics.checkNotNullParameter(viewableRecordItemCollectorFactory, "viewableRecordItemCollectorFactory");
        Intrinsics.checkNotNullParameter(adsTrackingInteractor, "adsTrackingInteractor");
        return new p((p56.a) factory.f180140b, navigationCommandsDispatcher, expandableDialogActionDispatcher, (gte.a) factory.f180141c, (x) factory.d, (sn.a) viewableRecordItemCollectorFactory.f229224b, adsTrackingInteractor);
    }

    public static c67.b B(r57.b factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new c67.b(factory.f251534b);
    }

    public static f C(w wVar) {
        f fVar = (f) wVar.b();
        s.k(fVar);
        return fVar;
    }

    public static DeviceManagementService D(Retrofit retrofit) {
        i.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(DeviceManagementService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        DeviceManagementService deviceManagementService = (DeviceManagementService) objCreate;
        s.k(deviceManagementService);
        return deviceManagementService;
    }

    public static nbb.b a(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, a31.a aVar19, a31.a aVar20, a31.a aVar21, a31.a aVar22, q qVar, a31.a aVar23, a31.a aVar24, a31.a aVar25, a31.a aVar26, a31.a aVar27, a31.a aVar28, a31.a aVar29, a31.a aVar30, a31.a aVar31, a31.a aVar32, a31.a aVar33, a31.a aVar34) {
        return new nbb.b(qVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29, aVar30, aVar31, aVar32, aVar33, aVar34);
    }

    public static wn.a b(vfg.p provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return provider.f();
    }

    public static n c(wn.a extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        s.k(extension);
        return extension;
    }

    public static n d(wn.a extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        s.k(extension);
        return extension;
    }

    public static u57.b e(r57.b factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new u57.b(factory.f251534b);
    }

    public static xe0.e f(d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        k.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "feature_device_management", mapper, 2, v.k(new l86.a(), new l86.b()), 32);
    }

    public static Set g(o5d.c extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        Set setC3 = extensions.f222423b.c3();
        s.k(setC3);
        return setC3;
    }

    public static xe0.e h(d mapper, xe0.f storageFactory, yk0.a dbSessionProvider) {
        nej.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dbSessionProvider, "dbSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, dbSessionProvider, "esim_core", mapper, 0, null, 56);
    }

    public static a67.a i(r57.b factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new a67.a(factory.f251535c, 6);
    }

    public static a67.a j(r57.b factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new a67.a(factory.f251535c, 5);
    }

    public static a67.a k(r57.b factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new a67.a(factory.f251535c, 7);
    }

    public static a67.a l(r57.b factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new a67.a(factory.f251535c, 0);
    }

    public static b67.a m(r57.b factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new b67.a();
    }

    public static x57.d n(r57.b factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new x57.d(factory.f251535c, factory.f251534b, factory.f251533a);
    }

    public static x57.d o(r57.b factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new x57.d(factory.f251535c, factory.f251534b, factory.f251533a);
    }

    public static w57.b p(r57.b factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new w57.b(factory.f251534b);
    }

    public static z57.b q(r57.b factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new z57.b(factory.f251534b);
    }

    public static z57.b r(r57.b factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new z57.b(factory.f251534b);
    }

    public static y57.b s(r57.b factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new y57.b(factory.f251534b);
    }

    public static yji.d t(o5d.c extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        return extensions.f222422a;
    }

    public static o5d.a u(o5d.c extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        return extensions.f222423b;
    }

    public static n v(o5d.c extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        return extensions.f222423b;
    }

    public static o5d.c w(c factory, o5d.b delegates) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        t5d.c cVarM = factory.m();
        return new o5d.c(new aah.g(delegates, cVarM), cVarM);
    }

    public static a67.d x(r57.b factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new a67.d(factory.f251534b);
    }

    public static b67.c y(r57.b factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new b67.c(factory.f251534b);
    }

    public static h z(c factory, i0 screen, f0 controllerModelExtension, on.a viewableRecordItemCollector) {
        nga.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(viewableRecordItemCollector, "viewableRecordItemCollector");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(viewableRecordItemCollector, "viewableRecordItemCollector");
        return new h(screen, controllerModelExtension, viewableRecordItemCollector, (gte.a) factory.f180141c);
    }
}
