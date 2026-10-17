package i7l;

import e7l.d;
import e7l.e;
import e7l.f;
import e7l.i;
import e7l.k;
import e7l.m;
import e7l.n;
import e7l.o;
import e7l.p;
import e7l.q;
import e7l.r;
import e7l.s;
import e7l.t;
import j7l.a;
import j7l.g;
import j7l.h;
import j7l.l;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import yhm.j;
import zhm.d0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f159336a = r0.k(new Pair("instagram", e.INSTAGRAM), new Pair("twitter", e.TWITTER), new Pair("other", e.OTHER));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f159337b = j.b(new hzl.a(29));

    public static final e7l.b a(a.C0977a c0977a) {
        return new e7l.b(mo3.a.o(c0977a.getMin()), mo3.a.o(c0977a.getMax()), mo3.a.o(c0977a.getDaily()), mo3.a.o(c0977a.getMonthly()));
    }

    public static final e7l.c b(j7l.a aVar) {
        if (aVar != null) {
            return new e7l.c(a(aVar.getTransaction()), a(aVar.getPaymentRequest()));
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public static final d c(j7l.b bVar) {
        Date date;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        try {
            date = ((SimpleDateFormat) f159337b.getValue()).parse(bVar.getEndDate());
        } catch (ParseException unused) {
            date = null;
        }
        e eVar = (e) u1.v(bVar.getSocialNetwork(), f159336a);
        if (eVar == null) {
            eVar = e.OTHER;
        }
        return new d(date, eVar, bVar.getUrl(), mo3.a.o(bVar.getReward()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:354:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x08f9  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0918  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x092a  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x094f  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0958  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x096f  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0974  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0987  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x098e  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x09a2  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x09a9  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x09be  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x09d3  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x09db  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0a06  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0a18  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0a3d  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0a49  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0a77  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0a9c  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0aa5  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0aaf  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0ab6  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0add  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0ae8  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0b22  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0b29  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0b2e  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0b35  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0b3c  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0b44  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0b4b  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0b56  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0b7f  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0b8a  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0bb1  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0bbf  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0bc4  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0bd3  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0bdd  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0be4  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0beb  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0bf3  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0bfa  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0c02  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0c0e  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0c1a  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0c45  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0c57  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0c7c  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0c88  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0cf8  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0d09  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0d49  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0d5c  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0d61  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0d68  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0d6d  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0d74  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0d7b  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0d83  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0db1  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0dc3  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0e04  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0e28  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0ecc  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x0eda  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0ee4  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0f07  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0f0b  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0f23  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x0f4b  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0f60  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0f67  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x0f6f  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0f98  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x0fa8  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x0fce  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x0fe5  */
    /* JADX WARN: Type inference failed for: r0v118, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v119 */
    /* JADX WARN: Type inference failed for: r0v120, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v176, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v71, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r100v0 */
    /* JADX WARN: Type inference failed for: r100v1 */
    /* JADX WARN: Type inference failed for: r100v3 */
    /* JADX WARN: Type inference failed for: r101v0 */
    /* JADX WARN: Type inference failed for: r101v1 */
    /* JADX WARN: Type inference failed for: r101v3 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r115v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r116v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r117v0 */
    /* JADX WARN: Type inference failed for: r117v1 */
    /* JADX WARN: Type inference failed for: r117v3 */
    /* JADX WARN: Type inference failed for: r119v0 */
    /* JADX WARN: Type inference failed for: r119v1 */
    /* JADX WARN: Type inference failed for: r119v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r119v3 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r120v0 */
    /* JADX WARN: Type inference failed for: r120v1 */
    /* JADX WARN: Type inference failed for: r120v3 */
    /* JADX WARN: Type inference failed for: r121v0 */
    /* JADX WARN: Type inference failed for: r121v1 */
    /* JADX WARN: Type inference failed for: r121v3 */
    /* JADX WARN: Type inference failed for: r122v0 */
    /* JADX WARN: Type inference failed for: r122v1 */
    /* JADX WARN: Type inference failed for: r122v3 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r132v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r139v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r140v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r18v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r1v158 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v46, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v89, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v107, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v12, types: [zhm.h0] */
    /* JADX WARN: Type inference failed for: r2v123, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v144, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v21, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v31, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v40, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v65, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v69, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v89, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v99, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v113, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v141, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v146, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v34, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v50, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v71, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v94, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v21, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v62, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v69, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r52v2 */
    /* JADX WARN: Type inference failed for: r52v3 */
    /* JADX WARN: Type inference failed for: r52v5 */
    /* JADX WARN: Type inference failed for: r55v4, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r57v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r60v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r61v0 */
    /* JADX WARN: Type inference failed for: r61v1 */
    /* JADX WARN: Type inference failed for: r61v3 */
    /* JADX WARN: Type inference failed for: r66v0 */
    /* JADX WARN: Type inference failed for: r66v1 */
    /* JADX WARN: Type inference failed for: r66v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r66v3 */
    /* JADX WARN: Type inference failed for: r67v0 */
    /* JADX WARN: Type inference failed for: r67v1 */
    /* JADX WARN: Type inference failed for: r67v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r67v3 */
    /* JADX WARN: Type inference failed for: r68v1 */
    /* JADX WARN: Type inference failed for: r68v2 */
    /* JADX WARN: Type inference failed for: r68v4 */
    /* JADX WARN: Type inference failed for: r72v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r73v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r77v0 */
    /* JADX WARN: Type inference failed for: r77v1 */
    /* JADX WARN: Type inference failed for: r77v3 */
    /* JADX WARN: Type inference failed for: r78v0 */
    /* JADX WARN: Type inference failed for: r78v1 */
    /* JADX WARN: Type inference failed for: r78v2 */
    /* JADX WARN: Type inference failed for: r81v0 */
    /* JADX WARN: Type inference failed for: r81v1 */
    /* JADX WARN: Type inference failed for: r81v2 */
    /* JADX WARN: Type inference failed for: r81v4 */
    /* JADX WARN: Type inference failed for: r81v5 */
    /* JADX WARN: Type inference failed for: r81v6 */
    /* JADX WARN: Type inference failed for: r81v7 */
    /* JADX WARN: Type inference failed for: r96v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r97v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r98v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final e7l.f d(j7l.c r144) {
        /*
            Method dump skipped, instruction units count: 4150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i7l.b.d(j7l.c):e7l.f");
    }

    public static final i e(g gVar) {
        return new i(com.bumptech.glide.d.c(gVar.getCountry()));
    }

    public static final e7l.j f(h hVar) {
        String name = hVar.getName();
        b7l.b.Companion.getClass();
        b7l.b bVar = (b7l.b) u1.u(name, b7l.b.mapping);
        j7l.i links = hVar.getLinks();
        return new e7l.j(bVar, links != null ? new k(links.getPrivacyPolicy(), links.getTerms()) : null);
    }

    public static final n g(j7l.k kVar) {
        if (kVar == null) {
            return null;
        }
        String umbrellaNameType = kVar.getUmbrellaNameType();
        String statementNameType = kVar.getStatementNameType();
        if (statementNameType == null) {
            statementNameType = "";
        }
        return new n(umbrellaNameType, statementNameType);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final t h(l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        String key = lVar.getKey();
        switch (key.hashCode()) {
            case -1507464081:
                if (key.equals("support.contact.blog")) {
                    return new o(lVar.getKey(), lVar.getLink());
                }
                break;
            case -207277625:
                if (key.equals("support.contact.report.bug")) {
                    return new q(lVar.getKey(), lVar.getLink());
                }
                break;
            case 801092053:
                if (key.equals("support.contact.system_status")) {
                    return new r(lVar.getKey(), lVar.getLink());
                }
                break;
            case 1360292668:
                if (key.equals("support.contact.community")) {
                    return new p(lVar.getKey(), lVar.getLink());
                }
                break;
        }
        return new s(lVar.getKey(), lVar.getLink());
    }

    /* JADX WARN: Type inference failed for: r2v178, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v74, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v64, types: [java.lang.Object, java.util.Map] */
    public static final j7l.e i(f fVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        long j2;
        String str;
        j7l.b bVar;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList7;
        jo3.a aVar;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        g gVar;
        h hVar;
        Long l2;
        ArrayList arrayList11;
        boolean z3;
        ArrayList arrayList12;
        ArrayList arrayList13;
        ArrayList arrayList14;
        Boolean bool;
        ArrayList arrayList15;
        Map mapT;
        Map map;
        j7l.k kVar;
        jo3.a aVar2;
        j7l.j jVar;
        ArrayList arrayList16;
        j7l.a aVar3;
        String str2;
        ArrayList arrayList17;
        ArrayList arrayList18;
        j7l.i iVar;
        String str3;
        String str4 = "<this>";
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String strValueOf = String.valueOf(fVar.f123359a);
        String strValueOf2 = String.valueOf(fVar.f123361b);
        String str5 = fVar.f123364c;
        boolean z4 = fVar.d;
        Long l3 = fVar.e;
        List list = fVar.f;
        ArrayList arrayList19 = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList19.add(((wi0.b) it8.next()).f297794a);
        }
        List list2 = fVar.f123371g;
        ArrayList arrayList20 = new ArrayList(w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            arrayList20.add(((wi0.b) it9.next()).f297794a);
        }
        List list3 = fVar.f123373h;
        ArrayList arrayList21 = new ArrayList(w.t(list3, 10));
        Iterator it10 = list3.iterator();
        while (it10.hasNext()) {
            arrayList21.add(((wi0.b) it10.next()).f297794a);
        }
        List list4 = fVar.i;
        ArrayList arrayList22 = new ArrayList(w.t(list4, 10));
        Iterator it11 = list4.iterator();
        while (it11.hasNext()) {
            arrayList22.add(((wi0.b) it11.next()).f297794a);
        }
        List list5 = fVar.k;
        ArrayList arrayList23 = new ArrayList(w.t(list5, 10));
        Iterator it12 = list5.iterator();
        while (it12.hasNext()) {
            arrayList23.add(((wi0.b) it12.next()).f297794a);
        }
        List list6 = fVar.f123379l;
        List list7 = fVar.f123380m;
        List list8 = fVar.f123376j;
        ArrayList arrayList24 = new ArrayList(w.t(list8, 10));
        Iterator it13 = list8.iterator();
        while (it13.hasNext()) {
            arrayList24.add(((wi0.b) it13.next()).f297794a);
        }
        List list9 = fVar.f123381n;
        ArrayList arrayList25 = new ArrayList(w.t(list9, 10));
        Iterator it14 = list9.iterator();
        while (it14.hasNext()) {
            arrayList25.add(((wi0.b) it14.next()).f297794a);
        }
        List list10 = fVar.o;
        ArrayList arrayList26 = new ArrayList(w.t(list10, 10));
        Iterator it15 = list10.iterator();
        while (it15.hasNext()) {
            arrayList26.add(((wi0.b) it15.next()).f297794a);
        }
        Map mapK = r0.k(new Pair("physical", Integer.valueOf(fVar.f123389r)), new Pair("virtual", Integer.valueOf(fVar.f123388q)), new Pair("extra_metallic", Integer.valueOf(fVar.f123391s)));
        Map map2 = fVar.f123394t;
        Map map3 = fVar.u;
        gel.a aVar4 = fVar.v;
        String strName = aVar4 != null ? aVar4.name() : null;
        String str6 = fVar.f123399w;
        String str7 = fVar.f123401x;
        long j3 = fVar.f123404y;
        String str8 = fVar.z;
        String str9 = fVar.A;
        int i = fVar.B;
        int i2 = fVar.C;
        int i3 = fVar.D;
        long j5 = fVar.E;
        long j16 = fVar.G;
        long j22 = fVar.F;
        long j42 = fVar.H;
        String str10 = fVar.I;
        List listD1 = d0.d1(fVar.J);
        String str11 = fVar.K;
        String str12 = fVar.L;
        List listD12 = d0.d1(fVar.M);
        Set set = fVar.T;
        ArrayList arrayList27 = new ArrayList(w.t(set, 10));
        Iterator it16 = set.iterator();
        while (it16.hasNext()) {
            arrayList27.add(((xi0.b) it16.next()).f306286a);
        }
        Set set2 = fVar.U;
        ArrayList arrayList28 = new ArrayList(w.t(set2, 10));
        Iterator it17 = set2.iterator();
        while (it17.hasNext()) {
            arrayList28.add(((xi0.b) it17.next()).f306286a);
        }
        Set set3 = fVar.N;
        ArrayList arrayList29 = new ArrayList(w.t(set3, 10));
        Iterator it18 = set3.iterator();
        while (it18.hasNext()) {
            arrayList29.add(((xi0.b) it18.next()).f306286a);
        }
        List listD13 = d0.d1(fVar.O);
        List listD14 = d0.d1(fVar.P);
        Set set4 = fVar.Q;
        ArrayList arrayList30 = new ArrayList(w.t(set4, 10));
        Iterator it19 = set4.iterator();
        while (it19.hasNext()) {
            arrayList30.add(((xi0.b) it19.next()).f306286a);
        }
        Set set5 = fVar.R;
        ArrayList arrayList31 = new ArrayList(w.t(set5, 10));
        Iterator it20 = set5.iterator();
        while (it20.hasNext()) {
            arrayList31.add(((xi0.b) it20.next()).f306286a);
        }
        Set set6 = fVar.S;
        ArrayList arrayList32 = new ArrayList(w.t(set6, 10));
        Iterator it21 = set6.iterator();
        while (it21.hasNext()) {
            xi0.b bVar2 = (xi0.b) it21.next();
            String str13 = bVar2.f306286a;
            Iterator it22 = it21;
            Long l4 = (Long) fVar.W.get(bVar2);
            arrayList32.add(new Pair(str13, Long.valueOf(l4 != null ? l4.longValue() : 0L)));
            it21 = it22;
        }
        Map mapT2 = r0.t(arrayList32);
        List list11 = fVar.V;
        ArrayList arrayList33 = new ArrayList(w.t(list11, 10));
        Iterator it23 = list11.iterator();
        while (it23.hasNext()) {
            arrayList33.add(((wi0.b) it23.next()).f297794a);
        }
        boolean z6 = fVar.X;
        List list12 = fVar.Y;
        ArrayList arrayList34 = new ArrayList(w.t(list12, 10));
        Iterator it24 = list12.iterator();
        while (it24.hasNext()) {
            arrayList34.add(((wi0.b) it24.next()).f297794a);
        }
        Set set7 = fVar.Z;
        ArrayList arrayList35 = new ArrayList(w.t(set7, 10));
        Iterator it25 = set7.iterator();
        while (it25.hasNext()) {
            arrayList35.add(((xi0.b) it25.next()).f306286a);
        }
        long j46 = fVar.f123360a0;
        long j47 = fVar.f123362b0;
        List list13 = fVar.c0;
        ArrayList arrayList36 = new ArrayList(w.t(list13, 10));
        Iterator it26 = list13.iterator();
        while (it26.hasNext()) {
            arrayList36.add(((wi0.b) it26.next()).f297794a);
        }
        List list14 = fVar.f123366d0;
        ArrayList arrayList37 = new ArrayList(w.t(list14, 10));
        Iterator it27 = list14.iterator();
        while (it27.hasNext()) {
            arrayList37.add(((wi0.b) it27.next()).f297794a);
        }
        String str14 = fVar.f123368e0;
        Instant instant = fVar.f0;
        Integer num = fVar.g0;
        List listD15 = d0.d1(fVar.f123374h0);
        ArrayList arrayList38 = new ArrayList(w.t(listD15, 10));
        Iterator it28 = listD15.iterator();
        while (it28.hasNext()) {
            arrayList38.add(((wi0.b) it28.next()).f297794a);
        }
        List list15 = fVar.i0;
        ArrayList arrayList39 = new ArrayList(w.t(list15, 10));
        for (Iterator it29 = list15.iterator(); it29.hasNext(); it29 = it29) {
            t tVar = (t) it29.next();
            Intrinsics.checkNotNullParameter(tVar, "<this>");
            arrayList39.add(new l(tVar.a(), tVar.b()));
        }
        List list16 = fVar.j0;
        ArrayList arrayList40 = new ArrayList(w.t(list16, 10));
        Iterator it30 = list16.iterator();
        while (it30.hasNext()) {
            arrayList40.add(((wi0.b) it30.next()).f297794a);
        }
        List list17 = fVar.f123377k0;
        if (list17 != null) {
            List list18 = list17;
            arrayList = arrayList40;
            arrayList2 = new ArrayList(w.t(list18, 10));
            Iterator it31 = list18.iterator();
            while (it31.hasNext()) {
                arrayList2.add(((b93.b) it31.next()).f13615a);
            }
        } else {
            arrayList = arrayList40;
            arrayList2 = null;
        }
        Set set8 = fVar.l0;
        ArrayList arrayList41 = arrayList2;
        ArrayList arrayList42 = new ArrayList(w.t(set8, 10));
        Iterator it32 = set8.iterator();
        while (it32.hasNext()) {
            arrayList42.add(((wi0.b) it32.next()).f297794a);
        }
        boolean z11 = fVar.m0;
        long j57 = fVar.f123382n0;
        long j58 = fVar.f123384o0;
        boolean z12 = fVar.p0;
        boolean z29 = fVar.q0;
        Map map4 = fVar.f123390r0;
        dj0.d dVar = fVar.f123392s0;
        jo3.a aVarP = dVar != null ? mo3.a.p(dVar) : null;
        dj0.d dVar2 = fVar.f123395t0;
        jo3.a aVarP2 = dVar2 != null ? mo3.a.p(dVar2) : null;
        boolean z31 = fVar.u0;
        d dVar3 = fVar.f123397v0;
        if (dVar3 != null) {
            Intrinsics.checkNotNullParameter(dVar3, "<this>");
            z = z29;
            Date date = dVar3.f123356a;
            if (date != null) {
                j2 = j57;
                str3 = ((SimpleDateFormat) f159337b.getValue()).format(date);
            } else {
                j2 = j57;
                str3 = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            str = str5;
            bVar = new j7l.b(str3, u1.g(dVar3.f123357b, f159336a), dVar3.f123358c, mo3.a.p(dVar3.d));
        } else {
            z = z29;
            j2 = j57;
            str = str5;
            bVar = null;
        }
        e7l.l lVar = fVar.f123400w0;
        boolean z41 = lVar.f123415a;
        boolean z49 = lVar.f123416b;
        dj0.d dVar4 = fVar.f123402x0;
        jo3.a aVarP3 = dVar4 != null ? mo3.a.p(dVar4) : null;
        boolean z54 = fVar.y0;
        boolean z74 = fVar.z0;
        String str15 = fVar.A0 ? "openbanking" : "";
        boolean z83 = fVar.B0;
        String strA = fVar.C0.a();
        String str16 = fVar.D0;
        List list19 = fVar.E0;
        jo3.a aVar5 = aVarP3;
        ArrayList arrayList43 = new ArrayList(w.t(list19, 10));
        Iterator it33 = list19.iterator();
        while (it33.hasNext()) {
            arrayList43.add(((wi0.b) it33.next()).f297794a);
        }
        List list20 = fVar.F0;
        ArrayList arrayList44 = new ArrayList(w.t(list20, 10));
        Iterator it34 = list20.iterator();
        while (it34.hasNext()) {
            arrayList44.add(((wi0.b) it34.next()).f297794a);
        }
        List list21 = fVar.H0;
        if (list21 != null) {
            List list22 = list21;
            arrayList3 = arrayList44;
            arrayList4 = new ArrayList(w.t(list22, 10));
            Iterator it35 = list22.iterator();
            while (it35.hasNext()) {
                arrayList4.add(((wi0.b) it35.next()).f297794a);
            }
        } else {
            arrayList3 = arrayList44;
            arrayList4 = null;
        }
        List list23 = fVar.K0;
        if (list23 != null) {
            List list24 = list23;
            arrayList5 = arrayList4;
            arrayList6 = new ArrayList(w.t(list24, 10));
            Iterator it36 = list24.iterator();
            while (it36.hasNext()) {
                arrayList6.add(((wi0.b) it36.next()).f297794a);
            }
        } else {
            arrayList5 = arrayList4;
            arrayList6 = null;
        }
        Map map5 = fVar.L0;
        if (map5 != null) {
            linkedHashMap = new LinkedHashMap(q0.b(map5.size()));
            for (Iterator it37 = map5.entrySet().iterator(); it37.hasNext(); it37 = it37) {
                Map.Entry entry = (Map.Entry) it37.next();
                linkedHashMap.put(((xi0.b) entry.getKey()).f306286a, entry.getValue());
            }
        } else {
            linkedHashMap = null;
        }
        boolean z89 = fVar.M0;
        dj0.d dVar5 = fVar.N0;
        jo3.a aVarP4 = dVar5 != null ? mo3.a.p(dVar5) : null;
        jo3.a aVarP5 = mo3.a.p(fVar.O0);
        List list25 = fVar.P0;
        if (list25 != null) {
            List<e7l.h> list26 = list25;
            linkedHashMap2 = linkedHashMap;
            arrayList7 = arrayList6;
            aVar = aVarP4;
            arrayList8 = new ArrayList(w.t(list26, 10));
            for (e7l.h hVar2 : list26) {
                Intrinsics.checkNotNullParameter(hVar2, str4);
                arrayList8.add(new j7l.f(hVar2.f123408a.f306286a, jli.b.b(hVar2.f123409b)));
                str4 = str4;
                str7 = str7;
                bVar = bVar;
            }
        } else {
            linkedHashMap2 = linkedHashMap;
            arrayList7 = arrayList6;
            aVar = aVarP4;
            arrayList8 = null;
        }
        j7l.b bVar3 = bVar;
        String str17 = str7;
        List list27 = fVar.G0;
        ArrayList arrayList45 = new ArrayList(w.t(list27, 10));
        Iterator it38 = list27.iterator();
        while (it38.hasNext()) {
            arrayList45.add(((wi0.b) it38.next()).f297794a);
        }
        i iVar2 = fVar.Q0;
        g gVar2 = iVar2 != null ? new g(iVar2.f123410a.f297794a) : null;
        boolean z96 = fVar.R0;
        m mVar = fVar.S0;
        j7l.j jVar2 = mVar != null ? new j7l.j(mVar.f123417a) : null;
        dj0.d dVar6 = fVar.T0;
        jo3.a aVarP6 = dVar6 != null ? mo3.a.p(dVar6) : null;
        e7l.j jVar3 = fVar.U0;
        if (jVar3 != null) {
            arrayList9 = arrayList45;
            b7l.b bVar4 = jVar3.f123411a;
            b7l.b.Companion.getClass();
            arrayList10 = arrayList8;
            String strG = u1.g(bVar4, b7l.b.mapping);
            k kVar2 = jVar3.f123412b;
            if (kVar2 != null) {
                gVar = gVar2;
                iVar = new j7l.i(kVar2.f123413a, kVar2.f123414b);
            } else {
                gVar = gVar2;
                iVar = null;
            }
            hVar = new h(strG, iVar);
        } else {
            arrayList9 = arrayList45;
            arrayList10 = arrayList8;
            gVar = gVar2;
            hVar = null;
        }
        List list28 = fVar.V0;
        Map map6 = fVar.W0;
        List list29 = fVar.X0;
        h hVar3 = hVar;
        ArrayList arrayList46 = new ArrayList(w.t(list29, 10));
        Iterator it39 = list29.iterator();
        while (it39.hasNext()) {
            arrayList46.add(((wi0.b) it39.next()).f297794a);
        }
        List list30 = fVar.Y0;
        ArrayList arrayList47 = new ArrayList(w.t(list30, 10));
        Iterator it40 = list30.iterator();
        while (it40.hasNext()) {
            arrayList47.add(((wi0.b) it40.next()).f297794a);
        }
        List list31 = fVar.f123363b1;
        ArrayList arrayList48 = new ArrayList(w.t(list31, 10));
        Iterator it41 = list31.iterator();
        while (it41.hasNext()) {
            arrayList48.add(((wi0.b) it41.next()).f297794a);
        }
        Integer num2 = fVar.Z0;
        Long l5 = fVar.f123365c1;
        boolean z100 = fVar.f123367d1;
        boolean z101 = fVar.f123369e1;
        boolean z102 = fVar.f123370f1;
        List list32 = fVar.f123372g1;
        if (list32 != null) {
            List list33 = list32;
            l2 = l5;
            arrayList11 = arrayList48;
            z3 = z100;
            arrayList12 = new ArrayList(w.t(list33, 10));
            Iterator it42 = list33.iterator();
            while (it42.hasNext()) {
                arrayList12.add(((wi0.b) it42.next()).f297794a);
            }
        } else {
            l2 = l5;
            arrayList11 = arrayList48;
            z3 = z100;
            arrayList12 = null;
        }
        List list34 = fVar.a1;
        if (list34 != null) {
            List list35 = list34;
            arrayList13 = arrayList12;
            arrayList14 = new ArrayList(w.t(list35, 10));
            Iterator it43 = list35.iterator();
            while (it43.hasNext()) {
                arrayList14.add(((wi0.b) it43.next()).f297794a);
            }
        } else {
            arrayList13 = arrayList12;
            arrayList14 = null;
        }
        Boolean bool2 = fVar.f123375h1;
        Map map7 = fVar.f123378k1;
        if (map7 != null) {
            bool = bool2;
            ArrayList arrayList49 = new ArrayList(map7.size());
            for (Iterator it44 = map7.entrySet().iterator(); it44.hasNext(); it44 = it44) {
                Map.Entry entry2 = (Map.Entry) it44.next();
                arrayList49.add(new Pair(((wi0.b) entry2.getKey()).f297794a, entry2.getValue()));
                arrayList14 = arrayList14;
            }
            arrayList15 = arrayList14;
            mapT = r0.t(arrayList49);
        } else {
            bool = bool2;
            arrayList15 = arrayList14;
            mapT = null;
        }
        n nVar = fVar.f123383n1;
        j7l.k kVar3 = nVar != null ? new j7l.k(nVar.f123418a, nVar.f123419b) : null;
        e7l.c cVar = fVar.f123387p1;
        if (cVar != null) {
            map = mapT;
            e7l.b bVar5 = cVar.f123354a;
            kVar = kVar3;
            aVar2 = aVarP6;
            jVar = jVar2;
            arrayList16 = arrayList46;
            a.C0977a c0977a = new a.C0977a(mo3.a.p(bVar5.f123351a), mo3.a.p(bVar5.f123352b), mo3.a.p(bVar5.f123353c), mo3.a.p(bVar5.d));
            e7l.b bVar6 = cVar.f123355b;
            aVar3 = new j7l.a(c0977a, new a.C0977a(mo3.a.p(bVar6.f123351a), mo3.a.p(bVar6.f123352b), mo3.a.p(bVar6.f123353c), mo3.a.p(bVar6.d)));
        } else {
            map = mapT;
            kVar = kVar3;
            aVar2 = aVarP6;
            jVar = jVar2;
            arrayList16 = arrayList46;
            aVar3 = null;
        }
        List listD16 = d0.d1(fVar.f123385o1);
        Integer num3 = fVar.f123393s1;
        Set setEntrySet = fVar.f123396t1.entrySet();
        int iB = q0.b(w.t(setEntrySet, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB);
        Iterator it45 = setEntrySet.iterator();
        while (it45.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it45.next();
            String str18 = ((xi0.b) entry3.getKey()).f306286a;
            Iterable iterable = (Iterable) entry3.getValue();
            List list36 = listD16;
            Integer num4 = num3;
            Iterator it46 = it45;
            ArrayList arrayList50 = new ArrayList(w.t(iterable, 10));
            Iterator it47 = iterable.iterator();
            while (it47.hasNext()) {
                arrayList50.add(((wi0.b) it47.next()).f297794a);
            }
            linkedHashMap3.put(str18, arrayList50);
            listD16 = list36;
            num3 = num4;
            it45 = it46;
        }
        List list37 = listD16;
        Integer num5 = num3;
        List list38 = fVar.f123398v1;
        ArrayList arrayList51 = new ArrayList(w.t(list38, 10));
        Iterator it48 = list38.iterator();
        while (it48.hasNext()) {
            arrayList51.add(((wi0.b) it48.next()).f297794a);
        }
        String str19 = fVar.f123403x1;
        boolean z103 = fVar.f123405y1;
        Set set9 = fVar.A1;
        if (set9 != null) {
            Set set10 = set9;
            str2 = str19;
            arrayList17 = arrayList51;
            arrayList18 = new ArrayList(w.t(set10, 10));
            Iterator it49 = set10.iterator();
            while (it49.hasNext()) {
                arrayList18.add(((xi0.b) it49.next()).f306286a);
            }
        } else {
            str2 = str19;
            arrayList17 = arrayList51;
            arrayList18 = null;
        }
        Boolean bool3 = fVar.C1;
        boolean z104 = fVar.H1;
        boolean z105 = fVar.K1;
        List list39 = fVar.L1;
        j7l.a aVar6 = aVar3;
        ArrayList arrayList52 = new ArrayList(w.t(list39, 10));
        Iterator it50 = list39.iterator();
        while (it50.hasNext()) {
            arrayList52.add(((wi0.b) it50.next()).f297794a);
        }
        List list40 = fVar.M1;
        ArrayList arrayList53 = new ArrayList(w.t(list40, 10));
        Iterator it51 = list40.iterator();
        while (it51.hasNext()) {
            arrayList53.add(((wi0.b) it51.next()).f297794a);
        }
        return new j7l.e(strValueOf, strValueOf2, str, Boolean.valueOf(z4), l3, arrayList19, arrayList20, arrayList21, arrayList22, arrayList23, list6, list7, arrayList25, arrayList26, arrayList24, mapK, map2, map3, str17, Long.valueOf(j3), str8, str9, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(j5), Long.valueOf(j22), Long.valueOf(j16), Long.valueOf(j42), str10, listD1, str11, str12, listD12, arrayList27, arrayList29, arrayList28, listD13, listD14, arrayList30, arrayList31, mapT2, arrayList33, Boolean.valueOf(z6), arrayList34, arrayList35, Long.valueOf(j46), Long.valueOf(j47), arrayList36, strName, str6, arrayList37, str14, instant, num, arrayList38, arrayList39, arrayList, arrayList41, arrayList42, Boolean.valueOf(z11), Long.valueOf(j2), Long.valueOf(j58), Boolean.valueOf(z12), Boolean.valueOf(z), map4, aVarP, aVarP2, Boolean.valueOf(z31), bVar3, Boolean.valueOf(z41), Boolean.valueOf(z49), aVar5, Boolean.valueOf(z54), Boolean.valueOf(z74), str15, Boolean.valueOf(z83), strA, str16, arrayList43, arrayList3, arrayList5, arrayList7, linkedHashMap2, Boolean.valueOf(z89), aVar, aVarP5, arrayList10, arrayList9, gVar, Boolean.valueOf(z96), jVar, aVar2, hVar3, list28, map6, arrayList16, arrayList47, arrayList11, num2, arrayList15, l2, Boolean.valueOf(z3), Boolean.valueOf(z101), Boolean.valueOf(z102), arrayList13, bool, map, kVar, list37, aVar6, num5, linkedHashMap3, arrayList17, str2, Boolean.valueOf(z103), arrayList18, bool3, Boolean.valueOf(z104), Boolean.valueOf(z105), arrayList52, arrayList53, d0.d1(fVar.N1), 16384, PKIFailureInfo.duplicateCertReq, 3145728, 0);
    }
}
