package z2;

import a9g.i0;
import a9g.k0;
import a9g.l0;
import a9g.n0;
import a9g.n1;
import a9g.o0;
import a9g.p0;
import a9g.q0;
import a9g.s1;
import a9g.v1;
import a9g.w1;
import a9g.z1;
import androidx.collection.ArrayMap;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.google.gson.reflect.TypeToken;
import com.revolut.data.utils.gson.GsonHolder;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kg.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z8g.j;
import z8g.l;
import z8g.n;
import z8g.r;
import z8g.s;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f318899b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f318898a = i;
        this.f318899b = obj2;
    }

    private final Object a(Object obj2) {
        int i;
        l0 l0Var;
        a9g.a aVar;
        i0 i0Var;
        ((j) this.f318899b).getClass();
        SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM hotels_inventory_provider");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logos");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "address");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "email");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "phone");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "termsAndConditionsUrl");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "disclaimers");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                if (text3 != null) {
                    i = columnIndexOrThrow;
                    o oVarA = GsonHolder.a();
                    Type type = new TypeToken<l0>() { // from class: com.revolut.feature.travel.hotels.impl.database.entity.HotelsInventoryProviderLogosEntityConverter$fromJson$lambda$0$$inlined$fromJson$1
                    }.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    Object objD = oVarA.d(text3, type);
                    Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
                    l0Var = (l0) objD;
                } else {
                    i = columnIndexOrThrow;
                    l0Var = null;
                }
                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                if (text4 != null) {
                    o oVarA2 = GsonHolder.a();
                    Type type2 = new TypeToken<a9g.a>() { // from class: com.revolut.feature.travel.hotels.impl.database.entity.AddressEntityConverter$fromJson$lambda$0$$inlined$fromJson$1
                    }.getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                    Object objD2 = oVarA2.d(text4, type2);
                    Intrinsics.checkNotNullExpressionValue(objD2, "fromJson(...)");
                    aVar = (a9g.a) objD2;
                } else {
                    aVar = null;
                }
                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                if (text8 != null) {
                    o oVarA3 = GsonHolder.a();
                    Type type3 = new TypeToken<i0>() { // from class: com.revolut.feature.travel.hotels.impl.database.entity.HotelsInventoryProviderDisclaimersEntityConverter$fromJson$lambda$0$$inlined$fromJson$1
                    }.getType();
                    Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                    Object objD3 = oVarA3.d(text8, type3);
                    Intrinsics.checkNotNullExpressionValue(objD3, "fromJson(...)");
                    i0Var = (i0) objD3;
                } else {
                    i0Var = null;
                }
                arrayList.add(new k0(text, text2, l0Var, aVar, text5, text6, text7, i0Var));
                columnIndexOrThrow = i;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    private final Object b(Object obj2) {
        ((l) this.f318899b).getClass();
        SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM hotels_location WHERE isPopular = 1");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "imageUrl");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "country");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "propertyCount");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coordinates");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDistrict");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isPopular");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new n0(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), a9g.l.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6)), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)), a9g.j.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8)), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    private final Object c(Object obj2) {
        p0 p0Var;
        n nVar = (n) this.f318899b;
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        nVar.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM hotels_promotions");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "start");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "end");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "maxDiscountPercentage");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "locationId");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isThirdPartyPromoEnabled");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requirements_checkInFrom");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requirements_checkOutTo");
            ArrayMap arrayMap = new ArrayMap();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                if (text != null) {
                    arrayMap.put(text, null);
                }
            }
            sQLiteStatementPrepare.reset();
            nVar.a(sQLiteConnection, arrayMap);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                double d = sQLiteStatementPrepare.getDouble(columnIndexOrThrow5);
                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                boolean z = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0;
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow8) && sQLiteStatementPrepare.isNull(columnIndexOrThrow9)) {
                    p0Var = null;
                } else {
                    p0Var = new p0(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                }
                o0 o0Var = new o0(text2, text3, text4, text5, d, text6, z, p0Var);
                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                arrayList.add(new q0(o0Var, text7 != null ? (n0) arrayMap.get(text7) : null));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th10) {
            sQLiteStatementPrepare.close();
            throw th10;
        }
    }

    private final Object d(Object obj2) {
        z1 z1Var;
        ((r) this.f318899b).getClass();
        SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM hotels_recent_location_searches ORDER BY searchTimestamp DESC");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "searchTimestamp");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "checkIn");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "checkOut");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "roomsOccupancy");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                if (text != null) {
                    o oVarA = GsonHolder.a();
                    Type type = new TypeToken<z1>() { // from class: com.revolut.feature.travel.hotels.impl.database.entity.LocationTypeEntityConverter$fromJson$lambda$0$$inlined$fromJson$1
                    }.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    Object objD = oVarA.d(text, type);
                    Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
                    z1Var = (z1) objD;
                } else {
                    z1Var = null;
                }
                arrayList.add(new v1(i, j2, z1Var, sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    private final Object e(Object obj2) {
        int i;
        s1 s1Var;
        n1 n1Var;
        ((s) this.f318899b).getClass();
        SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM hotels_recent_property_searches ORDER BY searchTimestamp DESC");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "searchTimestamp");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "propertyType");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "location");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "checkIn");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "checkOut");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "roomsOccupancy");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                if (text3 != null) {
                    i = columnIndexOrThrow;
                    o oVarA = GsonHolder.a();
                    Type type = new TypeToken<s1>() { // from class: com.revolut.feature.travel.hotels.impl.database.entity.HotelsPropertyTypeEntityConverter$fromJson$lambda$0$$inlined$fromJson$1
                    }.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    Object objD = oVarA.d(text3, type);
                    Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
                    s1Var = (s1) objD;
                } else {
                    i = columnIndexOrThrow;
                    s1Var = null;
                }
                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                if (text4 != null) {
                    o oVarA2 = GsonHolder.a();
                    Type type2 = new TypeToken<n1>() { // from class: com.revolut.feature.travel.hotels.impl.database.entity.HotelsPropertyLocationBriefEntityConverter$fromJson$lambda$0$$inlined$fromJson$1
                    }.getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                    Object objD2 = oVarA2.d(text4, type2);
                    Intrinsics.checkNotNullExpressionValue(objD2, "fromJson(...)");
                    n1Var = (n1) objD2;
                } else {
                    n1Var = null;
                }
                arrayList.add(new w1(text, j2, text2, s1Var, n1Var, sQLiteStatementPrepare.getLong(columnIndexOrThrow6), sQLiteStatementPrepare.getLong(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8)));
                columnIndexOrThrow = i;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:367:0x08b0, code lost:
    
        r10 = (com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x08b2, code lost:
    
        if (r10 == null) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x08b8, code lost:
    
        if (r10.available() == false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x08c3, code lost:
    
        if (((jte.d) r0).c(com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles.HideTaaFromProductsForOnboarded.f95855c) == false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x08c5, code lost:
    
        if (r4 != false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x08c7, code lost:
    
        r8 = new z28.k(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x08cd, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x08ce, code lost:
    
        r10 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x08d6, code lost:
    
        if (r10.hasNext() == false) goto L557;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x08d8, code lost:
    
        r12 = r10.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x08de, code lost:
    
        if ((r12 instanceof com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount.JIsa) == false) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x08e1, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x08e2, code lost:
    
        r12 = (com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount.JIsa) r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x08e4, code lost:
    
        if (r12 == null) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x08ea, code lost:
    
        if (r12.available() == false) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x08f5, code lost:
    
        if (((jte.d) r0).c(com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles.HideTaaFromProductsForOnboarded.f95855c) == false) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x08f7, code lost:
    
        if (r4 != false) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x08f9, code lost:
    
        r4 = new z28.k(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x08ff, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0900, code lost:
    
        r7 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0908, code lost:
    
        if (r7.hasNext() == false) goto L560;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x090a, code lost:
    
        r10 = r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0910, code lost:
    
        if ((r10 instanceof com.revolut.feature.wealth.api.domain.model.WealthAccount.Securities) == false) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0913, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0914, code lost:
    
        r10 = (com.revolut.feature.wealth.api.domain.model.WealthAccount.Securities) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0916, code lost:
    
        if (r10 == null) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x091c, code lost:
    
        if (r10.available() == false) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x091e, code lost:
    
        r7 = new z28.e(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0924, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0925, code lost:
    
        if (r9 == null) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0927, code lost:
    
        r10 = java.lang.Boolean.valueOf(r9.available());
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0930, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0935, code lost:
    
        if (pd.b.j(r10) == false) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0937, code lost:
    
        r10 = z28.i.f319015a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x093a, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x093b, code lost:
    
        r12 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0943, code lost:
    
        if (r12.hasNext() == false) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0945, code lost:
    
        r14 = r12.next();
        r21 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x094d, code lost:
    
        if ((r14 instanceof com.revolut.feature.wealth.api.domain.model.WealthAccount.Robo) == false) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0950, code lost:
    
        r2 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0953, code lost:
    
        r21 = r2;
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0956, code lost:
    
        r14 = (com.revolut.feature.wealth.api.domain.model.WealthAccount.Robo) r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0958, code lost:
    
        if (r14 == null) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x095a, code lost:
    
        r2 = java.lang.Boolean.valueOf(r14.available());
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0963, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0968, code lost:
    
        if (pd.b.j(r2) == false) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x096a, code lost:
    
        r2 = z28.h.f319014a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x096d, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x096e, code lost:
    
        r12 = com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType.Gia.f105270a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0970, code lost:
    
        if (r9 == null) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0978, code lost:
    
        if (r5.c(cfl.p.ETF, r12) == false) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x097a, code lost:
    
        r14 = new z28.d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0980, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0981, code lost:
    
        if (r9 == null) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0989, code lost:
    
        if (r5.c(cfl.p.BONDS, r12) == false) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x098b, code lost:
    
        r1 = z28.a.f319007a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x098e, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x098f, code lost:
    
        r22 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0997, code lost:
    
        if (r22.hasNext() == false) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0999, code lost:
    
        r23 = r3;
        r3 = r22.next();
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x09a3, code lost:
    
        if ((r3 instanceof com.revolut.feature.wealth.api.domain.model.WealthAccount.Commodities) == false) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x09a6, code lost:
    
        r3 = r23;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x09ab, code lost:
    
        r23 = r3;
        r24 = r11;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x09b0, code lost:
    
        r3 = (com.revolut.feature.wealth.api.domain.model.WealthAccount.Commodities) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x09b2, code lost:
    
        if (r3 == null) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x09b4, code lost:
    
        r3 = java.lang.Boolean.valueOf(r3.available());
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x09bd, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x09c2, code lost:
    
        if (pd.b.j(r3) != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x09cc, code lost:
    
        if (((jte.d) r0).c(com.revolut.feature.commodities.onboarding.api.CommoditiesOnboardingApi$Toggles$InvestCommoditiesToEtc.f65947c) == false) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x09cf, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x09d1, code lost:
    
        r0 = z28.c.f319009a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x09d3, code lost:
    
        r3 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x09db, code lost:
    
        if (r3.hasNext() == false) goto L567;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x09dd, code lost:
    
        r6 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x09e3, code lost:
    
        if ((r6 instanceof com.revolut.feature.wealth.api.domain.model.WealthAccount.Margin) == false) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x09e6, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x09e7, code lost:
    
        if (r6 == null) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x09e9, code lost:
    
        r3 = z28.b.f319008a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x09ec, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x09ed, code lost:
    
        if (r9 == null) goto L472;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x09f5, code lost:
    
        if (r5.c(cfl.p.MUTUAL_FUNDS, r12) == false) goto L472;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x09f7, code lost:
    
        r6 = z28.f.f319012a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x09fa, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x09fb, code lost:
    
        if (r9 == null) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x09fd, code lost:
    
        r22 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0a0f, code lost:
    
        if (r5.a(zhm.v.k(cfl.p.PRIVATE_MARKETS, cfl.p.PRIVATE_BANK)) == false) goto L478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0a11, code lost:
    
        r11 = z28.g.f319013a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0a14, code lost:
    
        r22 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0a16, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0a17, code lost:
    
        if (r9 == null) goto L483;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0a1f, code lost:
    
        if (r5.c(cfl.p.STRUCTURED_NOTES, r12) == false) goto L483;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0a21, code lost:
    
        r20 = z28.j.f319016a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0a26, code lost:
    
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0a28, code lost:
    
        r5 = new z28.l[12];
        r5[r23] = r8;
        r5[r21] = r4;
        r5[2] = r7;
        r5[3] = r10;
        r5[4] = r2;
        r5[5] = r14;
        r5[6] = r1;
        r5[r22] = r0;
        r5[8] = r3;
        r5[9] = r6;
        r5[r24] = r11;
        r5[11] = r20;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "elements");
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0a66, code lost:
    
        return zhm.d0.P0(kotlin.collections.d.L(r5), new q2j.v(r13, 29));
     */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0aae  */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 2816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.a.invoke(java.lang.Object):java.lang.Object");
    }
}
