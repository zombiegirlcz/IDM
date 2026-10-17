package qoi;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import ho.i;
import ho.n;
import ho.p;
import ho.w;
import ho.x;
import ho.y;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import noi.h;
import org.jetbrains.annotations.NotNull;
import prl.e;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends h {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bm0.a f248223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yf.c f248224b;

    public d(bm0.a cryptoWrapper, yf.c firebaseAnalyticsInteractor, roi.a eventNameNormalizer) {
        Intrinsics.checkNotNullParameter(cryptoWrapper, "cryptoWrapper");
        Intrinsics.checkNotNullParameter(firebaseAnalyticsInteractor, "firebaseAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(eventNameNormalizer, "eventNameNormalizer");
        this.f248223a = cryptoWrapper;
        this.f248224b = firebaseAnalyticsInteractor;
    }

    @Override // noi.h
    public final boolean a() {
        return true;
    }

    @Override // noi.h
    public final boolean c(n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return (event instanceof ho.a) || (event instanceof i) || (event instanceof p);
    }

    @Override // noi.h
    public final void d(y info) {
        String strA;
        Intrinsics.checkNotNullParameter(info, "info");
        if (info instanceof w) {
            strA = ((w) info).a();
        } else {
            if (!(info instanceof x)) {
                throw new NoWhenBranchMatchedException();
            }
            strA = null;
        }
        ((FirebaseAnalytics) ((a) this.f248224b.b).f248221a.getValue()).f49440a.zzO(strA != null ? this.f248223a.b(strA) : null);
    }

    @Override // noi.h
    public final void e(boolean z) {
        sd.a aVar = z ? sd.a.GRANTED : sd.a.DENIED;
        FirebaseAnalytics firebaseAnalytics = (FirebaseAnalytics) ((a) this.f248224b.b).f248221a.getValue();
        e eVar = new e();
        eVar.x(aVar);
        eVar.v(aVar);
        eVar.w(aVar);
        eVar.u(aVar);
        LinkedHashMap linkedHashMapG = eVar.g();
        firebaseAnalytics.getClass();
        Bundle bundle = new Bundle();
        sd.a aVar2 = (sd.a) linkedHashMapG.get(sd.b.AD_STORAGE);
        if (aVar2 != null) {
            int iOrdinal = aVar2.ordinal();
            if (iOrdinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (iOrdinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        sd.a aVar3 = (sd.a) linkedHashMapG.get(sd.b.ANALYTICS_STORAGE);
        if (aVar3 != null) {
            int iOrdinal2 = aVar3.ordinal();
            if (iOrdinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (iOrdinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        sd.a aVar4 = (sd.a) linkedHashMapG.get(sd.b.AD_USER_DATA);
        if (aVar4 != null) {
            int iOrdinal3 = aVar4.ordinal();
            if (iOrdinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (iOrdinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        sd.a aVar5 = (sd.a) linkedHashMapG.get(sd.b.AD_PERSONALIZATION);
        if (aVar5 != null) {
            int iOrdinal4 = aVar5.ordinal();
            if (iOrdinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (iOrdinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        firebaseAnalytics.f49440a.zzG(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // noi.h
    public final void f(n event) {
        String name;
        Bundle bundle;
        CharSequence charSequenceSubSequence;
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof p;
        if (z) {
            name = ((p) event).f154190a;
        } else if (event instanceof ho.a) {
            ho.a aVar = (ho.a) event;
            name = a0.d.s("click_", aVar.f154134a, "_", aVar.f154135b);
        } else if (!(event instanceof i)) {
            return;
        } else {
            name = j6.a.q("view_", ((i) event).f154167a);
        }
        Intrinsics.checkNotNullParameter(name, "name");
        StringBuilder sb6 = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (true) {
            bundle = null;
            if (i2 >= name.length()) {
                break;
            }
            char cCharAt = name.charAt(i2);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                cCharAt = '_';
            }
            Intrinsics.checkNotNullParameter(sb6, "<this>");
            Character chValueOf = sb6.length() != 0 ? Character.valueOf(sb6.charAt(sb6.length() - 1)) : null;
            if (cCharAt != '_' || chValueOf == null || chValueOf.charValue() != '_') {
                sb6.append(cCharAt);
            }
            i2++;
        }
        int length = sb6.length();
        while (true) {
            if (i >= length) {
                charSequenceSubSequence = "";
                break;
            } else {
                if (Character.isLetter(sb6.charAt(i))) {
                    charSequenceSubSequence = sb6.subSequence(i, sb6.length());
                    break;
                }
                i++;
            }
        }
        String string = charSequenceSubSequence.toString();
        ?? r06 = z ? ((p) event).f154191b : 0;
        String eventName = f0.U0(40, string);
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        FirebaseAnalytics firebaseAnalytics = (FirebaseAnalytics) ((a) this.f248224b.b).f248221a.getValue();
        if (r06 != 0) {
            bundle = new Bundle();
            for (Map.Entry entry : r06.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        firebaseAnalytics.f49440a.zzy(eventName, bundle);
        if (string.length() > 40) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.DEBUG, null, event + " can't be sent to firebase analytics due to length limitations", null, null, 16);
        }
    }
}
