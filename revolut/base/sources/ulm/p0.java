package ulm;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.revolut.core.security.provider.database.migration.NotMigratedDatabaseException;
import com.revolut.core.security.provider.database.migration.NotMigratedDatabasePreExistedException;
import com.revolut.data.database.AppRoomDatabase;
import com.revolut.feature.stories.StoriesActivity;
import com.revolut.feature.stories.StoriesContract$Configuration;
import com.revolut.kompot.entry_point.fragment.KompotFragment;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.text.Charsets;
import yhm.m;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class p0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f281122b;

    public /* synthetic */ p0(Object obj2, int i) {
        this.f281121a = i;
        this.f281122b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int iIntValue;
        Object objA;
        int i = this.f281121a;
        int i2 = 2;
        int i3 = 0;
        z = false;
        boolean z = false;
        int i5 = 1;
        Object[] objArr = 0;
        Object obj2 = this.f281122b;
        switch (i) {
            case 0:
                return (List) obj2;
            case 1:
                um0.b bVar = (um0.b) obj2;
                ue0.c cVar = bVar.f281175b;
                Class cls = Integer.TYPE;
                Integer num = (Integer) cVar.T2("DATABASE_SESSION_VERSION", cls);
                if (num != null && num.intValue() == 0) {
                    NotMigratedDatabaseException notMigratedDatabaseException = new NotMigratedDatabaseException();
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, notMigratedDatabaseException, h0Var);
                }
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    String[] strArrDatabaseList = bVar.f281174a.f8190a.databaseList();
                    Intrinsics.checkNotNullExpressionValue(strArrDatabaseList, "databaseList(...)");
                    int length = strArrDatabaseList.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length) {
                            String str = strArrDatabaseList[i6];
                            Intrinsics.h(str);
                            if (kotlin.text.d0.J(str, "revolut_app_room_db", true)) {
                                i3 = 1;
                            } else {
                                i6++;
                            }
                        }
                    }
                    int i21 = i3 ^ 1;
                    cVar.G(Integer.valueOf(i21), "DATABASE_SESSION_VERSION", wim.z.d(kotlin.jvm.internal.o0.b(cls)));
                    if (i3 != 0) {
                        NotMigratedDatabasePreExistedException notMigratedDatabasePreExistedException = new NotMigratedDatabasePreExistedException();
                        zhm.h0 h0Var2 = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, notMigratedDatabasePreExistedException, h0Var2);
                    }
                    iIntValue = i21;
                }
                return Integer.valueOf(iIntValue);
            case 2:
                Context context = ((uo.e) obj2).f281471a;
                Resources resources = context.getResources();
                DisplayMetrics displayMetrics = resources != null ? resources.getDisplayMetrics() : null;
                if (displayMetrics == null) {
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "AnalyticsTracker", "isTabled could be incorrect due to absence of resources in " + context, null, null, 16);
                } else {
                    double d = displayMetrics.widthPixels;
                    double d5 = displayMetrics.densityDpi;
                    double d6 = 2;
                    if (Math.sqrt(Math.pow(((double) displayMetrics.heightPixels) / d5, d6) + Math.pow(d / d5, d6)) >= 7.0d) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 3:
                try {
                    return (tg0.a) skm.e0.E(kotlin.coroutines.g.f186406a, new az0.r1((uo.k) obj2, objArr == true ? 1 : 0, 14));
                } catch (Exception e) {
                    zhm.h0 h0Var3 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "AnalyticsMsAdvertising", "getAdvertisingIdInfo error", e, h0Var3);
                    return null;
                }
            case 4:
                return ((v11.b) obj2).f285202a.g();
            case 5:
                KProperty[] kPropertyArr = StoriesActivity.f88741w0;
                return (StoriesContract$Configuration) ((StoriesActivity) obj2).G0();
            case 6:
                vji.b bVarZ = ((KompotFragment) obj2).z();
                Intrinsics.checkNotNullParameter(bVarZ, "<this>");
                return new uji.b(bVarZ.f289750a, bVarZ.f289751b, bVarZ.f289752c);
            case 7:
                return ((AppRoomDatabase) ((u0a.a) obj2).f276162b).j();
            case 8:
                ((com.revolut.kompot.bridge.impl.rootflow.a) obj2).I2();
                return Unit.f186387a;
            case 9:
                wl0.s sVar = (wl0.s) obj2;
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    ih0.a aVar = ih0.b.Companion;
                    ih0.b bVar2 = sVar.f298365c;
                    wl0.d dVar = new wl0.d(0);
                    KType type = kotlin.jvm.internal.o0.b(wl0.d.class);
                    Intrinsics.checkNotNullParameter(type, "type");
                    objA = (wl0.d) ((ii0.b) bVar2).f("PM_BIOMETRIC_PROMPT_MODEL_BLACK_LIST", dVar, jh.d.v(tlm.h.f272133a, type));
                    break;
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                Throwable thA = yhm.m.a(objA);
                if (thA != null) {
                    zhm.h0 h0Var4 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var4);
                }
                wl0.d dVar2 = new wl0.d(0);
                if (objA instanceof yhm.n) {
                    objA = dVar2;
                }
                return (wl0.d) objA;
            case 10:
                wl3.h hVar = (wl3.h) obj2;
                sl3.k kVar = (sl3.k) hVar.f298380a;
                kVar.getClass();
                efm.r map = efm.r.fromCallable(new sl3.f(kVar, i5)).map(new sk2.g(13, new sk2.f(21)));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                efm.r rVarF0 = te0.w.f0(ue0.e.E(map, zhm.f0.f322471a));
                sl3.u uVar = hVar.f298381b;
                efm.r rVarSwitchMap = uVar.f264133b.g().switchMap(new sl3.r(new sl3.s(uVar, 3), 9));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                efm.r map2 = te0.w.l(rVarF0, te0.w.f0(rVarSwitchMap)).map(new wl3.b(new wl3.d(i3), 5));
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                return ue0.e.E(map2, zhm.r0.g()).doOnNext(new wl3.b(new wk2.x(hVar, 4), i2)).replay(1).e();
            case 11:
                byte[] bytes = ((yk0.a) obj2).getToken().getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                return zhm.p.m(bytes, 0, 16);
            case 12:
                return rc.x.a((Context) ((ufm.g) obj2).f279885b);
            case 13:
                yii.e eVar = (yii.e) obj2;
                ue0.c cVar2 = eVar.f314334b;
                try {
                    String str2 = eVar.f314333a;
                    if (!Intrinsics.f((String) cVar2.T2("KOMPOT_STORAGE_VERSION", String.class), str2)) {
                        cVar2.clear();
                        cVar2.G(str2, "KOMPOT_STORAGE_VERSION", wim.z.d(kotlin.jvm.internal.o0.b(String.class)));
                    }
                    break;
                } catch (Throwable th11) {
                    zhm.h0 h0Var5 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList6 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th11, h0Var5);
                    cVar2.clear();
                }
                return cVar2;
            case 14:
                byte[] bytes2 = ((yj0.j) obj2).f314368b.getToken().getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
                byte[] bArrCopyOf = Arrays.copyOf(bytes2, 16);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                return bArrCopyOf;
            case 15:
                return ((Iterable) obj2).iterator();
            case 16:
                return new vvh.e(mo3.a.g(((zi1.d) obj2).d.j(w4l.h.f294642c), null, new z8d.h(23), 1), 19);
            default:
                return (lte.c) ((zoi.a) obj2).f324061a.invoke();
        }
    }
}
