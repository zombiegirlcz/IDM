package androidx.lifecycle;

import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import androidx.os.SavedStateRegistryController;
import androidx.os.SavedStateRegistryOwner;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import atg.k;
import az0.l1;
import b79.g;
import b80.c;
import bl0.f;
import com.revolut.core.mobile_services.impl.push.InternalMessagingService;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.storiesdelegates.StoriesDelegate;
import efm.r;
import eoi.o;
import fp.c$a;
import gm0.j;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import kotlin.text.Charsets;
import l21.d;
import lp.q1;
import net.zetetic.database.sqlcipher.SupportOpenHelperFactory;
import skm.e0;
import wim.z;
import xe0.e;
import z9h.n;
import zhm.f0;
import zii.h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7443b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f7442a = i;
        this.f7443b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int iIntValue;
        int i = 1;
        switch (this.f7442a) {
            case 0:
                return SavedStateHandleSupport.getSavedStateHandlesVM((ViewModelStoreOwner) this.f7443b);
            case 1:
                return ((Callable) this.f7443b).call();
            case 2:
                return ((SharedSQLiteStatement) this.f7443b).createNewStatement();
            case 3:
                e eVar = ((k) this.f7443b).f9054a;
                Type type = d.f191612c;
                Intrinsics.checkNotNullExpressionValue(type, "<get-LIST_OF_STRINGS_TYPE>(...)");
                List list = (List) eVar.T2("POCKETS_ORDER_STORAGE_NAME", type);
                return new ArrayList(list != null ? list : f0.f322471a);
            case 4:
                Object systemService = ((b70.e) this.f7443b).f12863a.getSystemService("accessibility");
                if (systemService instanceof AccessibilityManager) {
                    return (AccessibilityManager) systemService;
                }
                return null;
            case 5:
                return r.create(new g((c) this.f7443b, 6)).share().distinctUntilChanged();
            case 6:
                bji.b bVar = (bji.b) this.f7443b;
                return new h(bVar, bVar.f15677r, bVar.f15678s);
            case 7:
                ViewParent parent = ((View) this.f7443b).getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                ViewParent parent2 = viewGroup != null ? viewGroup.getParent() : null;
                ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                if (viewGroup2 != null) {
                    return viewGroup2.findViewById(R$id.storiesHost_backgroundImage);
                }
                return null;
            case 8:
                ((StoriesDelegate) this.f7443b).e.onNext(new Object());
                return Unit.f186387a;
            case 9:
                f fVar = ((ce0.d) this.f7443b).f23333a;
                byte[] bytes = fVar.d().getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                return new SupportOpenHelperFactory(bytes, new mp.r(fVar), false);
            case 10:
                ifm.c cVar = (ifm.c) ((java.util.concurrent.atomic.AtomicReference) this.f7443b).getAndSet(lfm.e.INSTANCE);
                if (cVar != null) {
                    cVar.dispose();
                }
                return Unit.f186387a;
            case 11:
                return ((cn.e) this.f7443b).a();
            case 12:
                ((cn0.g) this.f7443b).j();
                return Unit.f186387a;
            case 13:
                return SavedStateRegistryController.Companion.create$lambda$0((SavedStateRegistryOwner) this.f7443b);
            case 14:
                ((o) this.f7443b).V();
                return Unit.f186387a;
            case 15:
                return (q1) ((l1) this.f7443b).invoke();
            case 16:
                Object systemService2 = ((f86.a) this.f7443b).f132740a.getSystemService("keyguard");
                Intrinsics.i(systemService2, "null cannot be cast to non-null type android.app.KeyguardManager");
                return (KeyguardManager) systemService2;
            case 17:
                fo0.a aVar = (fo0.a) this.f7443b;
                Context context = aVar.f136733a;
                Application application = context instanceof Application ? (Application) context : null;
                if (application != null) {
                    application.registerActivityLifecycleCallbacks(aVar);
                }
                nhi.k.a(aVar);
                return Unit.f186387a;
            case 18:
                fp.c cVar2 = (fp.c) this.f7443b;
                c$a c_a = fp.c.Companion;
                ul0.a base64 = cVar2.a;
                c_a.getClass();
                Intrinsics.checkNotNullParameter(base64, "base64");
                Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
                cipher.init(1, new SecretKeySpec(base64.a("aI1gXAC/KakBorU+bI0H/C4/RoNa83IP5wbZjkLptak="), "AES"));
                Intrinsics.checkNotNullExpressionValue(cipher, "apply(...)");
                return cipher;
            case 19:
                gm0.f fVar2 = (gm0.f) this.f7443b;
                int i2 = 3;
                ue0.c cVar3 = fVar2.f144736a;
                Class cls = Integer.TYPE;
                Integer num = (Integer) cVar3.T2("PREF_KEY_CURRENT_DEVICE_ID_VERSION", cls);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    fVar2.f144736a.G(3, "PREF_KEY_CURRENT_DEVICE_ID_VERSION", z.d(o0.b(cls)));
                    iIntValue = 3;
                }
                if (iIntValue < 3) {
                    synchronized (fVar2) {
                        Integer num2 = (Integer) fVar2.f144736a.T2("PREF_KEY_LAST_SUCCESSFUL_DEVICE_ID_VERSION", cls);
                        if (num2 != null && num2.intValue() == iIntValue && iIntValue < 3) {
                            int iIntValue2 = num2.intValue();
                            if (iIntValue2 != 0) {
                                if (iIntValue2 != 1) {
                                    throw new IllegalStateException("migration is not supported");
                                }
                                i = 3;
                            }
                            fVar2.f144736a.G(Integer.valueOf(i), "PREF_KEY_CURRENT_DEVICE_ID_VERSION", z.d(o0.b(cls)));
                            iIntValue = i;
                        }
                    }
                }
                if (iIntValue > 3) {
                    fVar2.f144736a.I0("PREF_KEY_LAST_SUCCESSFUL_DEVICE_ID_VERSION");
                    fVar2.f144736a.G(3, "PREF_KEY_CURRENT_DEVICE_ID_VERSION", z.d(o0.b(cls)));
                } else {
                    i2 = iIntValue;
                }
                return Integer.valueOf(i2);
            case 20:
                j jVar = (j) this.f7443b;
                gm0.o oVar = jVar.f144742c;
                String str = (String) oVar.f144751a.T2("PREF_KEY_DEVICE_ID", String.class);
                if (str != null) {
                    return str;
                }
                Object objE = e0.E(kotlin.coroutines.g.f186406a, new ge7.f(jVar, null == true ? 1 : 0, 15));
                Intrinsics.h(objE);
                String deviceId = (String) objE;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(deviceId, "deviceId");
                n.l(String.class, oVar.f144751a, "PREF_KEY_DEVICE_ID", deviceId);
                return deviceId;
            case 21:
                lpi.e eVar2 = ((gn.c) this.f7443b).f144891j;
                KClass clazz = o0.f186429a.b(lpi.c.class);
                lpi.b bVar2 = (lpi.b) eVar2;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(clazz, "clazz");
                r rVarOfType = bVar2.f199140l.ofType(nim.a.o(clazz));
                Intrinsics.checkNotNullExpressionValue(rVarOfType, "ofType(...)");
                return r.mergeArray(rVarOfType.map(new gjg.e(new gk7.a(28), 22)), ((lpi.b) eVar2).f199141m.map(new gjg.e(new gk7.a(29), 23)));
            case 22:
                gq.b bVar3 = (gq.b) this.f7443b;
                return bVar3.f145470b.g(bVar3.f145469a);
            case 23:
                return FrameworkSQLiteOpenHelper.lazyDelegate$lambda$0((FrameworkSQLiteOpenHelper) this.f7443b);
            case 24:
                InternalMessagingService internalMessagingService = (InternalMessagingService) this.f7443b;
                int i3 = InternalMessagingService.f51397b;
                Context applicationContext = internalMessagingService.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                wh0.a.a(applicationContext);
                return (hi0.b) hi0.b.Companion.c();
            case 25:
                return (zf.a) ((ii0.b) this.f7443b).f161502a.invoke();
            case 26:
                return ((um.c) this.f7443b).a();
            case 27:
                return yem.h.b(((ing.b) this.f7443b).f162934a);
            case 28:
                if (((Boolean) ((ljd.e) ((yf.c) this.f7443b).b).invoke()).booleanValue()) {
                    return "yRRINvS8FWoN64fGVABiiRD9Ji/LnesiwAZraQQwg3bjYvU/g/350rTPVmbLrL3K+ynBhRqyWZbB0ZA6MVQAiw==";
                }
                String str2 = khi.a.b;
                Intrinsics.h(str2);
                return str2;
            default:
                return com.bumptech.glide.c.l(((iri.g) this.f7443b).f168056j);
        }
    }
}
