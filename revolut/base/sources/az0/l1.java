package az0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import com.ironz.binaryprefs.exception.EncryptionException;
import com.revolut.RevolutApplication;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.AddressFormat;
import com.revolut.feature.crypto.withdraw.impl.database.CryptoWithdrawDatabase;
import com.revolut.screen.sim_binding.api.SimBindingScreenContract$InputData;
import com.revolut.sso.api.models.SimBindingEvidence;
import com.revolut.sso.impl.domain.models.AuthAction;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.domain.models.ChallengeDetails;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.a2;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class l1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11327c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l1(View view, ViewGroup viewGroup, vp0.h hVar, Function0 function0, Function0 function02) {
        this.f11325a = 8;
        this.f11326b = view;
        this.d = viewGroup;
        this.e = hVar;
        this.f11327c = function0;
        this.f = function02;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, wl0.a] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        lj.c gVar;
        int i = this.f11325a;
        Object obj2 = this.f;
        Object obj3 = this.d;
        Object obj4 = this.e;
        ?? r87 = this.f11327c;
        Object obj5 = this.f11326b;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) r87;
                ImageView imageView = (ImageView) obj3;
                o1 o1Var = (o1) obj4;
                Function1 function1 = (Function1) obj2;
                Image image = ((UrlImage) obj5).f60022j;
                if (image != null) {
                    imageView.post(new m1(o1Var, image, imageView, function1, function0, 0));
                }
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f186387a;
            case 1:
                Function3 function3 = (Function3) obj5;
                String str = (String) r87;
                String str2 = (String) obj4;
                Clause clause = (Clause) obj2;
                if (function3 != null) {
                    function3.invoke(new Click(28, (Integer) null, this.d, str, false), str2, clause);
                }
                return Unit.f186387a;
            case 2:
                skm.e0.C((CoroutineScope) obj5, null, null, new c5a.m0(21, (View) obj3, (View) obj4, (View) obj2, (Function0) r87, null), 3);
                return Unit.f186387a;
            case 3:
                lm.c cVar = (lm.c) obj5;
                lp.o1 o1Var2 = new lp.o1();
                o1Var2.f197479a = new cpi.g(cVar, (ip.b) r87);
                RevolutApplication revolutApplication = cVar.f196833b;
                RevolutApplication.Companion aVar = RevolutApplication.INSTANCE;
                o1Var2.f197480b = new cpi.m(revolutApplication);
                o1Var2.e = new mp.p((voi.h) obj3, revolutApplication, (List) obj4);
                o1Var2.f = new mp.d();
                o1Var2.d = new mp.k(revolutApplication);
                o1Var2.f197483h = new mp.r((lm.c) obj2);
                vc.s.h(o1Var2.f197479a, cpi.g.class);
                vc.s.h(o1Var2.f197480b, cpi.m.class);
                if (o1Var2.f197481c == null) {
                    o1Var2.f197481c = new cpi.p();
                }
                vc.s.h(o1Var2.d, mp.k.class);
                vc.s.h(o1Var2.e, mp.p.class);
                if (o1Var2.f == null) {
                    o1Var2.f = new mp.d();
                }
                if (o1Var2.f197482g == null) {
                    o1Var2.f197482g = new mp.f();
                }
                vc.s.h(o1Var2.f197483h, mp.r.class);
                lp.q1 q1Var = new lp.q1(o1Var2.f197479a, o1Var2.f197480b, o1Var2.f197481c, o1Var2.d, o1Var2.e, o1Var2.f, o1Var2.f197482g, o1Var2.f197483h);
                Intrinsics.checkNotNullExpressionValue(q1Var, "build(...)");
                return q1Var;
            case 4:
                kql.h hVar = (kql.h) obj5;
                hd.e eVar = (hd.e) r87;
                Function1 function12 = (Function1) obj2;
                String strE = yjl.a.e((AuthAction) obj3, hVar.o);
                SimBindingEvidence simBindingEvidence = new SimBindingEvidence((String) obj4, "-1");
                a2 a2Var = hVar.f188452r;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                hVar.f188452r = hVar.T2(new kql.g(eVar, hVar, strE, simBindingEvidence, function12, null), new kog.k(hVar, 12));
                return Unit.f186387a;
            case 5:
                kql.h hVar2 = (kql.h) obj5;
                b5l.a aVar2 = hVar2.f188451q;
                ChallengeDetails.InSms inSms = (ChallengeDetails.InSms) ((Challenge) obj4).f106101g;
                String str3 = inSms.f106109a;
                String str4 = inSms.f106110b;
                SimBindingScreenContract$InputData inputData = new SimBindingScreenContract$InputData(SimBindingScreenContract$InputData.Mode.Linking.f104683a, (String) r87, (String) obj3, str3, str4);
                tll.s simBindingParentStateReceiver = hVar2.f188450p;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(simBindingParentStateReceiver, "simBindingParentStateReceiver");
                throw new IllegalStateException("Sim binding is not available");
            case 6:
                com.revolut.feature.address.common.impl.flow.validation_flow.c cVar2 = (com.revolut.feature.address.common.impl.flow.validation_flow.c) obj5;
                cVar2.T2(new pi1.c(cVar2, (Address) r87, (AddressFormat) obj3, (gi1.o) obj4, (gi1.o) obj2, null, 0), new yi5.b(27));
                return Unit.f186387a;
            case 7:
                Migration[] migrationArr = (Migration[]) r87;
                de0.a aVar3 = (de0.a) obj3;
                yk0.a aVar4 = (yk0.a) obj4;
                RoomDatabase.Builder builderAddMigrations = Room.databaseBuilder((Context) obj5, CryptoWithdrawDatabase.class, "crypto_withdraw_db").addMigrations((Migration[]) Arrays.copyOf(migrationArr, migrationArr.length));
                Iterator it8 = ((Set) obj2).iterator();
                while (it8.hasNext()) {
                    builderAddMigrations.addTypeConverter(it8.next());
                }
                return builderAddMigrations.openHelperFactory(new ce0.d(((bl0.g) aVar3).a("crypto_withdraw_db", aVar4.getToken())));
            case 8:
                vp0.i.b(vp0.k.Companion, (View) obj5, (ViewGroup) obj3, (vp0.h) obj4, (Function0) r87, (Function0) obj2, 32);
                return Unit.f186387a;
            case 9:
                Context context = (Context) obj5;
                String storageName = (String) r87;
                Lazy lazy = (Lazy) ((qm.e) obj3).f247740b;
                xql.a aVar5 = (xql.a) obj4;
                ye0.b bVar = (ye0.b) obj2;
                ij.d dVar = new ij.d(context);
                dVar.f161654l = ij.b.LAZY;
                dVar.f161653j = storageName;
                try {
                    gVar = new cpi.g((byte[]) lazy.getValue());
                    break;
                } catch (EncryptionException unused) {
                    gVar = lj.c.f195581r1;
                }
                dVar.f161655m = gVar;
                dVar.f161656n = new lj.b((byte[]) lazy.getValue());
                dVar.f161652h.f192417a.add(context.getSharedPreferences(storageName, 0));
                dVar.k = true;
                ij.a preferences = dVar.a();
                aVar5.a(preferences);
                bVar.getClass();
                Intrinsics.checkNotNullParameter(storageName, "storageName");
                Intrinsics.checkNotNullParameter(preferences, "preferences");
                if (bVar.f312742c.add(storageName)) {
                    skm.e0.C(bVar.f312740a, null, null, new wo2.l(bVar, storageName, preferences, null, 23), 3);
                }
                return preferences;
            default:
                wl0.c cVar3 = (wl0.c) obj5;
                zl0.a aVar6 = (zl0.a) obj3;
                rm0.q qVar = (rm0.q) obj4;
                rm0.e0 e0Var = (rm0.e0) obj2;
                int i2 = zl0.d.f323154a[cVar3.f298341b.a().ordinal()];
                if (i2 == 1) {
                    return new wl0.e(new xl0.b(r87, cVar3, xl0.c.f306898a), aVar6.a(), new vfg.p(qVar), e0Var);
                }
                if (i2 == 2) {
                    return new wl0.q(r87, aVar6.b(), new vfg.p(qVar));
                }
                throw new NoWhenBranchMatchedException();
        }
    }

    public /* synthetic */ l1(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f11325a = i;
        this.f11326b = obj2;
        this.f11327c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    public /* synthetic */ l1(CoroutineScope coroutineScope, View view, View view2, View view3, Function0 function0) {
        this.f11325a = 2;
        this.f11326b = coroutineScope;
        this.d = view;
        this.e = view2;
        this.f = view3;
        this.f11327c = function0;
    }

    public /* synthetic */ l1(kql.h hVar, String str, String str2, Challenge challenge, hd.e eVar, AuthAction authAction, Function1 function1) {
        this.f11325a = 5;
        this.f11326b = hVar;
        this.f11327c = str;
        this.d = str2;
        this.e = challenge;
        this.f = function1;
    }
}
