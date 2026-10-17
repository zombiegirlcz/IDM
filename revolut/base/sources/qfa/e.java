package qfa;

import android.content.SharedPreferences;
import com.revolut.feature.post_activation.impl.service.PostActivationService;
import ecm.q;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import mqc.p;
import ne0.j;
import nfj.i;
import org.jetbrains.annotations.NotNull;
import wim.z;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PostActivationService f245282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f245283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f245284c;
    public final x4l.c d;
    public final x4l.c e;

    /* JADX WARN: Multi-variable type inference failed */
    public e(PostActivationService service, j memoryCache, ue0.c storage, q prefs) {
        Object objA;
        ofa.b bVar;
        SharedPreferences sharedPreferences = (SharedPreferences) prefs.f124861b;
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(prefs, "retailPreferencesInteractor");
        this.f245282a = service;
        this.f245283b = memoryCache;
        this.f245284c = storage;
        final int i = 0;
        int i2 = 2;
        this.d = new x4l.c(new d(this, 0 == true ? 1 : 0, i), new Function1(this) { // from class: qfa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f245278b;

            {
                this.f245278b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (ofa.b) this.f245278b.f245283b.get("POST_ACTIVATION_FLOW_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f245278b.f245283b.get("POST_ACTIVATION_STEPS_KEY");
                }
            }
        }, new Function2(this) { // from class: qfa.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f245280b;

            {
                this.f245280b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i) {
                    case 0:
                        ofa.b postActivationFlow = (ofa.b) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(postActivationFlow, "postActivationFlow");
                        this.f245280b.f245283b.f("POST_ACTIVATION_FLOW_KEY", postActivationFlow);
                        break;
                    default:
                        List steps = (List) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(steps, "steps");
                        this.f245280b.f245283b.f("POST_ACTIVATION_STEPS_KEY", steps);
                        break;
                }
                return Unit.f186387a;
            }
        }, new p(i2, 26, 0 == true ? 1 : 0), new p24.q((Object) this, (Continuation) (0 == true ? 1 : 0), 17));
        final int i3 = 1;
        this.e = new x4l.c(new d(this, 0 == true ? 1 : 0, i3), new Function1(this) { // from class: qfa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f245278b;

            {
                this.f245278b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (ofa.b) this.f245278b.f245283b.get("POST_ACTIVATION_FLOW_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f245278b.f245283b.get("POST_ACTIVATION_STEPS_KEY");
                }
            }
        }, new Function2(this) { // from class: qfa.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f245280b;

            {
                this.f245280b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                switch (i3) {
                    case 0:
                        ofa.b postActivationFlow = (ofa.b) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(postActivationFlow, "postActivationFlow");
                        this.f245280b.f245283b.f("POST_ACTIVATION_FLOW_KEY", postActivationFlow);
                        break;
                    default:
                        List steps = (List) obj3;
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(steps, "steps");
                        this.f245280b.f245283b.f("POST_ACTIVATION_STEPS_KEY", steps);
                        break;
                }
                return Unit.f186387a;
            }
        }, new p(i2, 27, 0 == true ? 1 : 0), new i(3, 13, 0 == true ? 1 : 0));
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Class cls = Boolean.TYPE;
        if (Intrinsics.f(j6.a.k(cls, storage, "legacy_migration_done"), Boolean.TRUE)) {
            return;
        }
        Object objF = prefs.f("POST_ACTIVATION_FLOW_KEY");
        String str = objF instanceof String ? (String) objF : null;
        if (str != null) {
            if (str.equals("CREDIT_CARD_PREMIUM_ONBOARDING")) {
                bVar = ofa.b.RETAIL_CREDIT_ONBOARDING;
            } else {
                try {
                    m.Companion companion = m.INSTANCE;
                    objA = ofa.b.valueOf(str);
                } catch (Throwable th10) {
                    m.Companion companion2 = m.INSTANCE;
                    objA = o.a(th10);
                }
                bVar = (ofa.b) (objA instanceof n ? null : objA);
            }
            if (bVar != null) {
                storage.G(bVar, "POST_ACTIVATION_FLOW_KEY", z.d(o0.b(ofa.b.class)));
            }
        }
        Object objF2 = prefs.f("SELECTED_PLAN_ID_KEY");
        String str2 = objF2 instanceof String ? (String) objF2 : null;
        if (str2 != null && str2.length() != 0) {
            z9h.n.l(String.class, storage, "SELECTED_PLAN_ID_KEY", str2);
        }
        Intrinsics.checkNotNullParameter("PROFILE_DETAILS_ONBOARDING_SEEN", "key");
        if (sharedPreferences.contains("PROFILE_DETAILS_ONBOARDING_SEEN")) {
            com.revolut.data.database.models.openbanking.d.D(cls, storage, "POST_ACTIVATION_STEP_PROFILE_SEEN", Boolean.valueOf(prefs.c("PROFILE_DETAILS_ONBOARDING_SEEN", false)));
        }
        Intrinsics.checkNotNullParameter("CONTACTS_SYNC_ONBOARDING_SEEN", "key");
        if (sharedPreferences.contains("CONTACTS_SYNC_ONBOARDING_SEEN")) {
            com.revolut.data.database.models.openbanking.d.D(cls, storage, "POST_ACTIVATION_STEP_CONTACTS_SYNC_SEEN", Boolean.valueOf(prefs.c("CONTACTS_SYNC_ONBOARDING_SEEN", false)));
        }
        com.revolut.data.database.models.openbanking.d.D(cls, storage, "legacy_migration_done", Boolean.TRUE);
    }

    public final void a() {
        com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, this.f245284c, "POST_ACTIVATION_STEP_CONTACTS_SYNC_SEEN", Boolean.TRUE);
    }

    public final void b() {
        com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, this.f245284c, "POST_ACTIVATION_STEP_PROFILE_SEEN", Boolean.TRUE);
    }
}
