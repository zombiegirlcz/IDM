package sl3;

import ch.qos.logback.core.net.SyslogConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f264130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f264131b;

    public /* synthetic */ s(u uVar, int i) {
        this.f264130a = i;
        this.f264131b = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        String str2;
        String str3;
        List contacts = (List) obj2;
        switch (this.f264130a) {
            case 0:
                Intrinsics.checkNotNullParameter(contacts, "contacts");
                return efm.r.fromIterable(d0.S(contacts, SyslogConstants.LOG_CLOCK)).flatMapCompletable(new r(new s(this.f264131b, 1), 6));
            case 1:
                Intrinsics.checkNotNullParameter(contacts, "remoteContactsChunk");
                u uVar = this.f264131b;
                w4l.f fVar = uVar.e;
                List list = contacts;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((ml3.o) it8.next()).f206609a);
                }
                efm.d0 d0VarFirstOrError = zi0.c.q(fVar.f(new ql3.c(arrayList), false), f0.f322471a).firstOrError();
                r rVar = new r(new s(uVar, 2), 7);
                d0VarFirstOrError.getClass();
                return new pfm.a(d0VarFirstOrError, rVar, 4);
            case 2:
                Intrinsics.checkNotNullParameter(contacts, "remoteExtras");
                ml3.s sVar = this.f264131b.f264133b;
                List<ql3.d> list2 = contacts;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                for (ql3.d dVar : list2) {
                    String code = dVar.getCode();
                    String userName = dVar.getUserName();
                    String pricePlan = dVar.getPricePlan();
                    String birthday = dVar.getBirthday();
                    String legalName = dVar.getLegalName();
                    if (legalName == null) {
                        legalName = "";
                    }
                    String firstName = dVar.getFirstName();
                    if (firstName == null) {
                        firstName = "";
                    }
                    String lastName = dVar.getLastName();
                    if (lastName == null) {
                        lastName = "";
                    }
                    String name = dVar.getName();
                    if (name == null) {
                        String str4 = lastName;
                        str3 = "";
                        str = firstName;
                        str2 = str4;
                    } else {
                        str = firstName;
                        str2 = lastName;
                        str3 = name;
                    }
                    arrayList2.add(new ml3.p(code, userName, pricePlan, birthday, legalName, str, str2, str3));
                }
                return sVar.e(arrayList2);
            default:
                Intrinsics.checkNotNullParameter(contacts, "extras");
                if (contacts.isEmpty()) {
                    return efm.r.just(f0.f322471a);
                }
                List list3 = contacts;
                int iB = q0.b(w.t(list3, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj3 : list3) {
                    linkedHashMap.put(((ml3.p) obj3).f206615a, obj3);
                }
                return this.f264131b.f264132a.h(d0.d1(linkedHashMap.keySet())).map(new r(new awk.j(linkedHashMap, 18), 10));
        }
    }
}
