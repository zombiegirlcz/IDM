package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset;

import ang.f;
import cli.y;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.AddEditAssetContract$InputData$Mode;
import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetFieldDefinition;
import gp3.n;
import grd.s;
import grd.t;
import grd.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import oki.h;
import tsj.g;
import vkm.j2;
import vkm.q;
import w4l.i;
import w4l.j;
import wli.x;
import yji.l;
import zh9.u0;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends h implements grd.c {
    public final grd.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ird.b f87919p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ird.e f87920q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f87921r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.a f87922s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w80.b f87923t;
    public final f u;
    public final x v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final dtd.a f87924w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f87925x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f87926y;

    public d(grd.b inputData, ird.b countryPickerInteractor, ird.e currencyPickerInteractor, g customAssetsInteractor, com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.a smartEstimationExtension, w80.b amountFormatter, i90.b uuidUtils, f userInteractor, x deeplinkHandler, e stateMapper, dtd.a smartEstimationProductArticleProvider) {
        grd.a aVar;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(countryPickerInteractor, "countryPickerInteractor");
        Intrinsics.checkNotNullParameter(currencyPickerInteractor, "currencyPickerInteractor");
        Intrinsics.checkNotNullParameter(customAssetsInteractor, "customAssetsInteractor");
        Intrinsics.checkNotNullParameter(smartEstimationExtension, "smartEstimationExtension");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(smartEstimationProductArticleProvider, "smartEstimationProductArticleProvider");
        this.o = inputData;
        this.f87919p = countryPickerInteractor;
        this.f87920q = currencyPickerInteractor;
        this.f87921r = customAssetsInteractor;
        this.f87922s = smartEstimationExtension;
        this.f87923t = amountFormatter;
        this.u = userInteractor;
        this.v = deeplinkHandler;
        this.f87924w = smartEstimationProductArticleProvider;
        String strU = wp5.y.u(uuidUtils, "toString(...)");
        AddEditAssetContract$InputData$Mode addEditAssetContract$InputData$Mode = inputData.f145991a;
        if (addEditAssetContract$InputData$Mode instanceof AddEditAssetContract$InputData$Mode.Create) {
            boolean zI2 = I2();
            AddEditAssetContract$InputData$Mode.Create create = (AddEditAssetContract$InputData$Mode.Create) addEditAssetContract$InputData$Mode;
            CustomAssetCategoryDefinition customAssetCategoryDefinition = create.f87908b;
            aVar = new grd.a(customAssetCategoryDefinition.f99224a, customAssetCategoryDefinition.f99225b, create.f87907a, r0.g(), r0.g(), r0.g(), strU, zI2 ? "assetName" : "purchaseAmount", false, false);
        } else {
            if (!(addEditAssetContract$InputData$Mode instanceof AddEditAssetContract$InputData$Mode.Edit)) {
                throw new NoWhenBranchMatchedException();
            }
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            AddEditAssetContract$InputData$Mode.Edit edit = (AddEditAssetContract$InputData$Mode.Edit) addEditAssetContract$InputData$Mode;
            CustomAssetCategoryDefinition customAssetCategoryDefinition2 = edit.f87911c;
            CustomAsset customAsset = edit.f87910b;
            Map map3 = customAsset.i;
            boolean zBooleanValue = customAsset.k;
            for (Map.Entry entry : map3.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                for (CustomAssetFieldDefinition customAssetFieldDefinition : customAssetCategoryDefinition2.f99225b) {
                    if (Intrinsics.f(customAssetFieldDefinition.f99227a, str)) {
                        switch (t.f146014b[customAssetFieldDefinition.f99229c.ordinal()]) {
                            case 1:
                            case 6:
                                map2.put(str, value);
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 7:
                                map.put(str, value);
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            vzi.b bVar = customAsset.f99217b;
            ArrayList arrayList = customAssetCategoryDefinition2.f99225b;
            xi0.b bVar2 = edit.f87909a;
            Map map4 = customAsset.i;
            if (I2()) {
                if (edit.e) {
                    zBooleanValue = true;
                } else {
                    Boolean bool = edit.d;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    }
                }
            }
            aVar = new grd.a(bVar, arrayList, bVar2, map, map2, map4, strU, null, zBooleanValue, customAsset.k);
        }
        this.f87925x = mra.d.b(this, aVar, stateMapper, null, false, 12);
        this.f87926y = hx7.e.a(this, new ghl.c(this, 15));
    }

    @Override // yji.l
    public final void I1() {
        AddEditAssetContract$InputData$Mode addEditAssetContract$InputData$Mode = this.o.f145991a;
        Continuation continuation = null;
        if (addEditAssetContract$InputData$Mode instanceof AddEditAssetContract$InputData$Mode.Create) {
            ArrayList arrayList = ((AddEditAssetContract$InputData$Mode.Create) addEditAssetContract$InputData$Mode).f87908b.f99225b;
            if (!arrayList.isEmpty()) {
                Iterator it8 = arrayList.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    } else if (Intrinsics.f(((CustomAssetFieldDefinition) it8.next()).f99227a, "country")) {
                        l2(new ge7.f(this, continuation, 25), new yi5.b(26));
                        break;
                    }
                }
            }
        }
        Flow flowQ = q.q(nim.a.v(this.f87921r.g(j.f294644c), new gqa.a(13)));
        if (I2()) {
            l.a1(this, rd0.e.d(mo3.a.g(u0.m(flowQ, this.f87922s.c3(i.f294643c)), null, new n(12), 1), h0.f322473a), null, null, new v(this, null, 1), 3);
        } else {
            l.a1(this, rd0.e.d(mo3.a.g(flowQ, null, new n(11), 1), h0.f322473a), null, null, new v(this, null, 0), 3);
        }
    }

    public final boolean I2() {
        return this.o.f145991a.a() && this.f87921r.e();
    }

    public final void J2(String fieldName, boolean z, Object obj2) {
        Object next;
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        y yVar = this.f87925x;
        Iterator it8 = ((grd.a) ((j2) yVar.f22677a).getValue()).f145983b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (Intrinsics.f(((CustomAssetFieldDefinition) next).f99227a, fieldName)) {
                    break;
                }
            }
        }
        CustomAssetFieldDefinition customAssetFieldDefinition = (CustomAssetFieldDefinition) next;
        if (customAssetFieldDefinition == null) {
            return;
        }
        if (z) {
            if (obj2 == null) {
                H2(yVar, new gqh.a(fieldName, 2));
                return;
            }
            Object objA = rrd.d.a(customAssetFieldDefinition, obj2);
            if (objA != null) {
                H2(yVar, new s(0, fieldName, objA));
                return;
            }
            return;
        }
        if (obj2 == null) {
            H2(yVar, new gqh.a(fieldName, 3));
            return;
        }
        Object objA2 = rrd.d.a(customAssetFieldDefinition, obj2);
        if (objA2 != null) {
            H2(yVar, new s(1, fieldName, objA2));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f87926y;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f87925x;
    }
}
