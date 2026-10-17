package ip0;

import android.graphics.drawable.GradientDrawable;
import android.os.Parcel;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.tracking.v3.CreditApplicationCommonContext;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class v7 {
    public static void A(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static void B(SupportSQLiteDatabase supportSQLiteDatabase, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase, str);
        supportSQLiteDatabase.beginTransaction();
        supportSQLiteDatabase.execSQL(str2);
        supportSQLiteDatabase.execSQL(str3);
        supportSQLiteDatabase.setTransactionSuccessful();
        supportSQLiteDatabase.endTransaction();
    }

    public static void C(String str, int i, int i2, int i3, aim.e eVar) {
        eVar.add(new gu(str, i, i2, i3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void D(pyl.b bVar) throws Exception {
        boolean zIsTerminated;
        if (bVar instanceof AutoCloseable) {
            bVar.close();
            return;
        }
        if (!(bVar instanceof ExecutorService)) {
            throw new IllegalArgumentException();
        }
        ExecutorService executorService = (ExecutorService) bVar;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static int a(int i, int i2, MoneyClause moneyClause) {
        return (moneyClause.hashCode() + i) * i2;
    }

    public static int b(int i, int i2, TextClause textClause) {
        return (textClause.hashCode() + i) * i2;
    }

    public static int c(int i, int i2, dj0.d dVar) {
        return (dVar.hashCode() + i) * i2;
    }

    public static int d(Parcel parcel, LinkedHashSet linkedHashSet, int i, int i2) {
        linkedHashSet.add(parcel.readSerializable());
        return i + i2;
    }

    public static int e(cam.f fVar, int i, int i2) {
        return (fVar.hashCode() + i) * i2;
    }

    public static int f(cfl.j jVar, int i, int i2) {
        return (jVar.hashCode() + i) * i2;
    }

    public static int g(UrlImage urlImage, int i, int i2) {
        return (urlImage.hashCode() + i) * i2;
    }

    public static int h(dfl.q qVar, int i, int i2) {
        return (qVar.hashCode() + i) * i2;
    }

    public static int i(LocalDateTime localDateTime, int i, int i2) {
        return (localDateTime.hashCode() + i) * i2;
    }

    public static int j(jo3.a aVar, int i, int i2) {
        return (aVar.hashCode() + i) * i2;
    }

    public static GradientDrawable k(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(i);
        return gradientDrawable;
    }

    public static ConstraintSet l(ConstraintLayout constraintLayout) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(constraintLayout);
        return constraintSet;
    }

    public static com.google.protobuf.w0 m(CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration, AnalyticsContext.Companion companion) {
        CreditApplicationCommonContext creditApplicationCommonContextN = com.google.crypto.tink.shaded.protobuf.t1.N(creditApplicationPluginFlowContract$Configuration);
        companion.getClass();
        return AnalyticsContext.Companion.a(creditApplicationCommonContextN);
    }

    public static e4m.e n(jje.c cVar, jje.h hVar, int i) {
        return e4m.b.b(new jdi.i(cVar, hVar, i, 11));
    }

    public static e4m.e o(jje.c cVar, jje.i iVar, int i) {
        return e4m.b.b(new jdi.i(cVar, iVar, i, 12));
    }

    public static e4m.e p(jqa.e eVar, jqa.g gVar, jqa.f fVar, int i) {
        return e4m.b.b(new il8.d(eVar, gVar, fVar, i, 9));
    }

    public static e4m.e q(jqa.e eVar, jqa.i iVar, int i) {
        return e4m.b.b(new jqa.h(eVar, iVar, i, 0));
    }

    public static Object r(String str, String str2, ne0.j jVar) {
        return jVar.get(str + str2);
    }

    public static Object s(JsonElement jsonElement, String str, JsonElement jsonElement2, String str2) {
        Intrinsics.checkNotNullParameter(jsonElement, str);
        return rlm.j.k(jsonElement2).get(str2);
    }

    public static String t(Parcel parcel, String str, String str2) {
        Intrinsics.checkNotNullParameter(parcel, str);
        String string = parcel.readString();
        Intrinsics.checkNotNullParameter(string, str2);
        return string;
    }

    public static ArrayList u(LinkedHashMap linkedHashMap, Integer num) {
        ArrayList arrayList = new ArrayList();
        linkedHashMap.put(num, arrayList);
        return arrayList;
    }

    public static KotlinNothingValueException v(String str) {
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(str);
        return new KotlinNothingValueException();
    }

    public static Flow w(Flow flow) {
        return vkm.q.q(new vkm.t0(flow, 1));
    }

    public static pfm.h x(ufm.f fVar, String str) {
        pfm.h hVar = new pfm.h(fVar, 4);
        Intrinsics.checkNotNullExpressionValue(hVar, str);
        return hVar;
    }

    public static vkm.q0 y(String str, String str2, Flow flow) {
        return rd0.e.n(flow, zhm.y0.b(new Pair(str, str2)));
    }

    public static wn.a z(vn.a aVar, String str) {
        vfg.p pVarB = aVar.b();
        Intrinsics.checkNotNullParameter(pVarB, str);
        return pVarB.f();
    }
}
