package vmg;

import do3.i;
import do3.j;
import do3.k;
import do3.l;
import do3.m;
import do3.t;
import do3.u;
import java.time.Instant;
import java.util.LinkedHashMap;
import jng.h;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import le.u1;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f290578a = r0.k(new Pair("WAITING_FOR_VERIFICATION", l.WAITING_FOR_VERIFICATION), new Pair("IN_REVIEW", l.IN_REVIEW), new Pair("VERIFIED", l.VERIFIED), new Pair("REJECTED", l.REJECTED), new Pair("EXPIRED", l.EXPIRED), new Pair("UNKNOWN", l.UNKNOWN));

    public static final u a(jng.f fVar) {
        k kVar;
        t tVar;
        m mVar;
        Instant instant;
        Instant instant2;
        j jVar;
        l lVar;
        String state = fVar.getState();
        t[] tVarArrValues = t.values();
        int length = tVarArrValues.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            kVar = null;
            if (i2 >= length) {
                tVar = null;
                break;
            }
            tVar = tVarArrValues[i2];
            if (a0.z(tVar.name(), state, true)) {
                break;
            }
            i2++;
        }
        if (tVar == null) {
            tVar = t.NOT_VERIFIED;
        }
        t tVar2 = tVar;
        h verification = fVar.getVerification();
        if (verification != null) {
            Intrinsics.checkNotNullParameter(verification, "<this>");
            String state2 = verification.getState();
            l[] lVarArrValues = l.values();
            int length2 = lVarArrValues.length;
            while (true) {
                if (i >= length2) {
                    lVar = null;
                    break;
                }
                lVar = lVarArrValues[i];
                if (a0.z(lVar.name(), state2, true)) {
                    break;
                }
                i++;
            }
            if (lVar == null) {
                lVar = l.UNKNOWN;
            }
            mVar = new m(lVar, verification.getEmail());
        } else {
            mVar = null;
        }
        String verifiedUntil = fVar.getVerifiedUntil();
        if (verifiedUntil != null) {
            try {
                instant = Instant.parse(verifiedUntil);
            } catch (Exception unused) {
                instant = null;
            }
            instant2 = instant;
        } else {
            instant2 = null;
        }
        jng.e eligibility = fVar.getEligibility();
        if (eligibility != null) {
            Intrinsics.checkNotNullParameter(eligibility, "<this>");
            jVar = new j(new i(eligibility.getAgeRange().getStart(), eligibility.getAgeRange().getEnd()));
        } else {
            jVar = null;
        }
        jng.g university = fVar.getUniversity();
        if (university != null) {
            Intrinsics.checkNotNullParameter(university, "<this>");
            kVar = new k(university.getName());
        }
        return new u(tVar2, mVar, instant2, jVar, kVar);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.Map] */
    public static final jng.f b(u uVar) {
        h hVar;
        jng.e eVar;
        jng.g gVar = null;
        if (uVar == null) {
            return null;
        }
        t tVar = uVar.f116432a;
        LinkedHashMap linkedHashMap = b.f290575a;
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        String strG = u1.g(tVar, b.f290575a);
        m mVar = uVar.f116433b;
        if (mVar != null) {
            Intrinsics.checkNotNullParameter(mVar, "<this>");
            hVar = new h(u1.g(mVar.f116406a, f290578a), mVar.f116407b);
        } else {
            hVar = null;
        }
        Instant instant = uVar.f116434c;
        String string = instant != null ? instant.toString() : null;
        j jVar = uVar.d;
        if (jVar != null) {
            Intrinsics.checkNotNullParameter(jVar, "<this>");
            i iVar = jVar.f116404a;
            eVar = new jng.e(new jng.a(iVar.f116402a, iVar.f116403b));
        } else {
            eVar = null;
        }
        k kVar = uVar.e;
        if (kVar != null) {
            Intrinsics.checkNotNullParameter(kVar, "<this>");
            gVar = new jng.g(kVar.f116405a);
        }
        return new jng.f(strG, hVar, string, eVar, gVar);
    }
}
