package h30;

import android.os.Parcel;
import android.view.View;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import h93.l0;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class l {
    public static void A(int i, List list, Style style, int i2, LargeActionButton largeActionButton) {
        largeActionButton.setText(new TextLocalisedClause(i, list, style, i2));
    }

    public static void B(Parcel parcel, int i, l0 l0Var) {
        parcel.writeInt(i);
        parcel.writeString(l0Var.name());
    }

    public static void C(ij.a aVar, String str) {
        ij.e eVarEdit = aVar.edit();
        eVarEdit.i(str);
        eVarEdit.commit();
    }

    public static boolean D(xi0.a aVar, String str) {
        aVar.getClass();
        return cp5.d.A(xi0.a.a(str));
    }

    public static int a(int i, int i2, AnalyticsProduct analyticsProduct) {
        return (analyticsProduct.hashCode() + i) * i2;
    }

    public static int b(AccountId accountId, int i, int i2) {
        return (accountId.hashCode() + i) * i2;
    }

    public static int c(CompositeClause compositeClause, int i, int i2) {
        return (compositeClause.hashCode() + i) * i2;
    }

    public static int d(TimeClause timeClause, int i, int i2) {
        return (timeClause.hashCode() + i) * i2;
    }

    public static int e(LayeredImage layeredImage, int i, int i2) {
        return (layeredImage.hashCode() + i) * i2;
    }

    public static int f(TransferScheduleData transferScheduleData, int i, int i2) {
        return (transferScheduleData.hashCode() + i) * i2;
    }

    public static int g(io3.d dVar, int i, int i2) {
        return (dVar.hashCode() + i) * i2;
    }

    public static int h(ZonedDateTime zonedDateTime, int i, int i2) {
        return (zonedDateTime.hashCode() + i) * i2;
    }

    public static int i(qv0.c cVar, int i, int i2) {
        return (cVar.hashCode() + i) * i2;
    }

    public static int j(xi0.b bVar, int i, int i2) {
        return (bVar.hashCode() + i) * i2;
    }

    public static e4m.e k(n nVar, int i) {
        return e4m.b.b(new m(nVar, i));
    }

    public static e4m.e l(n nVar, t tVar, int i) {
        return e4m.b.b(new h08.e(nVar, tVar, i, 9));
    }

    public static e4m.e m(h9h.a aVar, int i) {
        return e4m.b.b(new fw2.l(aVar, i, 17));
    }

    public static e4m.e n(i0l.d dVar, int i) {
        return e4m.b.b(new gff.a(dVar, i, 27));
    }

    public static e4m.e o(i0l.d dVar, i0l.c cVar, int i) {
        return e4m.b.b(new hjg.b(dVar, cVar, i, 19));
    }

    public static j60.c p(com.revolut.kompot.navigable.a controller, rp0.m dialogDisplayer) {
        he2.b dialogHostFinder = kxa.j.o(new nji.b());
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
        return new j60.c(controller, dialogDisplayer, dialogHostFinder);
    }

    public static Boolean q(String str, od0.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, str);
        return Boolean.valueOf(iVar.d());
    }

    public static String r(String str, String str2) {
        return (str + str2).toString();
    }

    public static String s(String str, LocalDate localDate) {
        return str + localDate;
    }

    public static String t(p0 p0Var, Class cls, StringBuilder sb6) {
        sb6.append(p0Var.b(cls));
        return sb6.toString();
    }

    public static ArrayList u(LinkedHashMap linkedHashMap, LocalDate localDate) {
        ArrayList arrayList = new ArrayList();
        linkedHashMap.put(localDate, arrayList);
        return arrayList;
    }

    public static Iterator v(Parcel parcel, int i, Map map) {
        parcel.writeInt(i);
        parcel.writeInt(map.size());
        return map.entrySet().iterator();
    }

    public static py0.f w(View view, View view2) {
        Intrinsics.h(view);
        return or0.u.k(view2).n0();
    }

    public static ty0.c x(View view, String str, View view2) {
        Intrinsics.checkNotNullExpressionValue(view, str);
        return or0.u.k(view2).b0();
    }

    public static vkm.d y(ihm.f fVar, ihm.f fVar2, String str) {
        efm.r rVarMerge = efm.r.merge(fVar, fVar2);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, str);
        return rd0.e.b(rVarMerge);
    }

    public static yy0.f z(View view, String str, View view2) {
        Intrinsics.checkNotNullExpressionValue(view, str);
        return or0.u.k(view2).Q();
    }
}
