package sl3;

import com.revolut.feature.contacts.core.platform.model.DeviceContact;
import efm.d0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lhi.v;
import ljl.n1;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f264099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f264100b;

    public /* synthetic */ c(k kVar, int i) {
        this.f264099a = i;
        this.f264100b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f264099a) {
            case 0:
                efm.r it8 = (efm.r) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                final int i = 0;
                final k kVar = this.f264100b;
                return it8.switchMap(new kfm.o() { // from class: sl3.e
                    @Override // kfm.o, androidx.arch.core.util.Function
                    public final Object apply(Object it9) {
                        switch (i) {
                            case 0:
                                Intrinsics.checkNotNullParameter(it9, "it");
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(it9, "it");
                                break;
                        }
                        return kVar.f264118j;
                    }
                });
            case 1:
                bl3.b it9 = (bl3.b) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                if (it9 != bl3.b.GRANTED) {
                    return d0.m(r0.g());
                }
                k kVar2 = this.f264100b;
                Map map = (Map) kVar2.i.get("DEVICE_CONTACTS_MAP");
                if (map != null) {
                    return d0.m(map);
                }
                return new ufm.i(kVar2.c(), new sk2.g(15, new c(kVar2, 4)), 1);
            case 2:
                List<DeviceContact> phoneContacts = (List) obj2;
                Intrinsics.checkNotNullParameter(phoneContacts, "phoneContacts");
                if (phoneContacts.isEmpty()) {
                    return this.f264100b.f264115c.d();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (DeviceContact deviceContact : phoneContacts) {
                    String str = deviceContact.f65992c;
                    String str2 = deviceContact.f65992c;
                    if (linkedHashMap.containsKey(str)) {
                        DeviceContact deviceContact2 = (DeviceContact) linkedHashMap.get(str2);
                        if (deviceContact2 != null && deviceContact2.f65990a > deviceContact.f65990a) {
                            linkedHashMap.put(str2, deviceContact);
                        }
                    } else {
                        linkedHashMap.put(str2, deviceContact);
                    }
                }
                return zhm.d0.d1(linkedHashMap.values());
            case 3:
                List it10 = (List) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                this.f264100b.getClass();
                return k.h(it10);
            case 4:
                List<zm3.a> contacts = (List) obj2;
                Intrinsics.checkNotNullParameter(contacts, "contacts");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (zm3.a aVar : contacts) {
                    if (aVar instanceof zm3.i) {
                        zm3.i iVar = (zm3.i) aVar;
                        if (!kotlin.text.d0.W(hx7.q.x(iVar.e()))) {
                            if (!kotlin.text.d0.W(iVar.e().getPhone())) {
                                linkedHashMap2.put(iVar.e().getPhone(), iVar.e());
                            }
                            if (!kotlin.text.d0.W(iVar.getCode())) {
                                linkedHashMap2.put(iVar.getCode(), iVar.e());
                            }
                        }
                    }
                    if ((aVar instanceof zm3.f) && !kotlin.text.d0.W(hx7.q.x((zm3.g) aVar))) {
                        zm3.f fVar = (zm3.f) aVar;
                        if (!kotlin.text.d0.W(fVar.getPhone())) {
                            linkedHashMap2.put(fVar.getPhone(), aVar);
                        }
                    }
                    if ((aVar instanceof zm3.e) && !kotlin.text.d0.W(hx7.q.x((zm3.g) aVar))) {
                        zm3.e eVar = (zm3.e) aVar;
                        if (!kotlin.text.d0.W(eVar.getEmail())) {
                            linkedHashMap2.put(eVar.getEmail(), aVar);
                        }
                    }
                }
                this.f264100b.i.f("DEVICE_CONTACTS_MAP", linkedHashMap2);
                return linkedHashMap2;
            case 5:
                efm.r it11 = (efm.r) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                final int i2 = 1;
                final k kVar3 = this.f264100b;
                return it11.switchMap(new kfm.o() { // from class: sl3.e
                    @Override // kfm.o, androidx.arch.core.util.Function
                    public final Object apply(Object it92) {
                        switch (i2) {
                            case 0:
                                Intrinsics.checkNotNullParameter(it92, "it");
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(it92, "it");
                                break;
                        }
                        return kVar3.f264118j;
                    }
                });
            case 6:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                List list = (List) rVar.f314201a;
                List list2 = (List) rVar.f314202b;
                List list3 = (List) rVar.f314203c;
                Intrinsics.h(list);
                this.f264100b.getClass();
                ArrayList arrayListH = k.h(list);
                Intrinsics.h(list2);
                return new zm3.d(arrayListH, k.h(k.b(list2)), k.h(k.b(list3)));
            case 7:
                List ids = (List) obj2;
                Intrinsics.checkNotNullParameter(ids, "ids");
                ao.h hVar = this.f264100b.f264113a;
                Intrinsics.checkNotNullParameter(ids, "ids");
                efm.r map2 = ((ml3.a) hVar.f7847b).p(ids).map(new v(21, new n1(hVar, 19)));
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                return map2;
            default:
                String userName = (String) obj2;
                Intrinsics.checkNotNullParameter(userName, "userName");
                return (List) this.f264100b.f264116g.get(userName);
        }
    }
}
