package com.revolut.data.database.models.openbanking;

import akg.n;
import android.os.Parcel;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import androidx.compose.ui.unit.Dp;
import com.revolut.data.utils.gson.GsonHolder;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import cwi.w;
import cwi.x;
import db1.f;
import dfl.q0;
import dmc.k;
import dmc.r;
import dqj.q;
import dw3.q8;
import e4m.e;
import efm.s;
import ehe.l;
import java.util.LinkedHashSet;
import java.util.List;
import k4l.r0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kxa.j;
import mx4.a1;
import nii.n1;
import org.joda.time.LocalDate;
import rp0.m;
import rp0.p0;
import wim.z;
import zhm.y0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class d {
    public static void A(long j2, String str, StringBuilder sb6) {
        sb6.append((Object) Color.m1985toStringimpl(j2));
        sb6.append(str);
    }

    public static void B(DrawContext drawContext, long j2) {
        drawContext.getCanvas().restore();
        drawContext.mo2191setSizeuvyYCjk(j2);
    }

    public static /* synthetic */ void C(s sVar) {
        if (sVar != null) {
            throw new ClassCastException();
        }
    }

    public static void D(Class cls, ue0.c cVar, String str, Boolean bool) {
        cVar.G(bool, str, z.d(o0.b(cls)));
    }

    public static int a(float f, int i, int i2) {
        return (Dp.m3300hashCodeimpl(f) + i) * i2;
    }

    public static int b(int i, int i2, long j2) {
        return (Color.m1984hashCodeimpl(j2) + i) * i2;
    }

    public static int c(TransferFlowType transferFlowType, int i, int i2) {
        return (transferFlowType.hashCode() + i) * i2;
    }

    public static int d(q0 q0Var, int i, int i2) {
        return (q0Var.hashCode() + i) * i2;
    }

    public static int e(Class cls, Parcel parcel, LinkedHashSet linkedHashSet, int i, int i2) {
        linkedHashSet.add(parcel.readParcelable(cls.getClassLoader()));
        return i + i2;
    }

    public static int f(r0 r0Var, int i, int i2) {
        return (r0Var.hashCode() + i) * i2;
    }

    public static int g(LocalDate localDate, int i, int i2) {
        return (localDate.hashCode() + i) * i2;
    }

    public static ValueElementSequence h(float f, ValueElementSequence valueElementSequence, String str, InspectorInfo inspectorInfo) {
        valueElementSequence.set(str, Dp.m3295boximpl(f));
        return inspectorInfo.getProperties();
    }

    public static e i(x xVar, int i) {
        return e4m.b.b(new w(xVar, i));
    }

    public static e j(deh.b bVar, deh.a aVar, int i) {
        return e4m.b.b(new f(bVar, aVar, i, 3));
    }

    public static e k(r rVar, k kVar, int i) {
        return e4m.b.b(new f(rVar, kVar, i, 19));
    }

    public static e l(dqj.r rVar, int i) {
        return e4m.b.b(new q(rVar, i));
    }

    public static e m(ehe.c cVar, ehe.a aVar, ehe.e eVar, int i) {
        return e4m.b.b(new q8(cVar, aVar, eVar, i, 26));
    }

    public static e n(ehe.c cVar, ehe.a aVar, ehe.k kVar, int i) {
        return e4m.b.b(new q8(cVar, aVar, kVar, i, 28));
    }

    public static e o(ehe.c cVar, ehe.b bVar, ehe.f fVar, int i) {
        return e4m.b.b(new q8(cVar, bVar, fVar, i, 27));
    }

    public static e p(ehe.c cVar, ehe.b bVar, l lVar, int i) {
        return e4m.b.b(new q8(cVar, bVar, lVar, i, 29));
    }

    public static j60.c q(iq3.a aVar, com.revolut.kompot.navigable.a controller, m dialogDisplayer) {
        he2.b dialogHostFinder = j.o(new nji.b());
        aVar.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
        return new j60.c(controller, dialogDisplayer, dialogHostFinder);
    }

    public static String r(String str, List list) {
        String strK = GsonHolder.a().k(list);
        Intrinsics.checkNotNullExpressionValue(strK, str);
        return strK;
    }

    public static String s(String str, n1 n1Var) {
        return str + n1Var;
    }

    public static String t(StringBuilder sb6, Object obj2, String str) {
        sb6.append(obj2);
        sb6.append(str);
        return sb6.toString();
    }

    public static kx4.r0 u(l70.e eVar, com.revolut.kompot.navigable.a controller) {
        qd0.b languageProvider = eVar.n();
        vc.s.j(languageProvider);
        jx4.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        return new kx4.r0(controller, languageProvider);
    }

    public static a1 v(lx4.a aVar) {
        vc.s.j(aVar);
        return new a1();
    }

    public static r60.d w(com.revolut.kompot.navigable.a controller, p0 displayer) {
        he2.b dialogHostFinder = j.o(new nji.b());
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(displayer, "displayer");
        Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
        return new r60.d(controller, displayer, dialogHostFinder);
    }

    public static vkm.q0 x(String str, String str2, n nVar) {
        return rd0.e.n(nVar, y0.b(new Pair(str, str2)));
    }

    public static vkm.q0 y(String str, String str2, vkm.d dVar) {
        return rd0.e.n(dVar, y0.b(new Pair(str, str2)));
    }

    public static void z(float f, String str, StringBuilder sb6) {
        sb6.append((Object) Dp.m3301toStringimpl(f));
        sb6.append(str);
    }
}
