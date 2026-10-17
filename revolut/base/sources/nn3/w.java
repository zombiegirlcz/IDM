package nn3;

import com.revolut.feature.contacts_chooser.api.models.ContactsFilter;
import com.revolut.feature.contacts_chooser.api.navigation.ContactType;
import com.revolut.feature.contacts_chooser.api.navigation.ContactType$DeviceContact$Email;
import com.revolut.feature.contacts_chooser.api.navigation.ContactType$DeviceContact$Phone;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserInputData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import le.u1;
import vkm.j2;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f217461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.contacts_chooser.impl.ui.a f217462b;

    public /* synthetic */ w(com.revolut.feature.contacts_chooser.impl.ui.a aVar, int i) {
        this.f217461a = i;
        this.f217462b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String strSubstring;
        List filterContactTypes;
        ContactType.UsernameContact usernameContact;
        ContactType$DeviceContact$Phone contactType$DeviceContact$Phone;
        ContactType.VirtualContact virtualContact;
        ContactType$DeviceContact$Email contactType$DeviceContact$Email;
        ContactType.Group group;
        efm.r rVarJ;
        ContactType$DeviceContact$Phone contactType$DeviceContact$Phone2;
        ContactType.VirtualContact virtualContact2;
        ContactType.Group group2;
        ContactType$DeviceContact$Email contactType$DeviceContact$Email2;
        ContactType.UsernameContact usernameContact2;
        d3a.a aVar;
        e3a.c cVar;
        List listE0;
        switch (this.f217461a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                String searchQuery = (String) pair.f186385a;
                com.revolut.feature.contacts_chooser.impl.ui.a aVar2 = this.f217462b;
                kn3.b bVar = aVar2.f66088p;
                Intrinsics.h(searchQuery);
                a aVar3 = ((c) ((j2) aVar2.A.f22677a).getValue()).f217441g;
                ContactsChooserInputData contactsChooserInputData = aVar2.o;
                List allowedContactTypes = contactsChooserInputData.f66064c;
                boolean z = contactsChooserInputData.f66065g;
                boolean z3 = contactsChooserInputData.o;
                Set transactionsCurrencies = contactsChooserInputData.f66071p;
                ContactsFilter contactsFilter = contactsChooserInputData.f66067j;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                Intrinsics.checkNotNullParameter(allowedContactTypes, "allowedContactTypes");
                String str = "transactionsCurrencies";
                Intrinsics.checkNotNullParameter(transactionsCurrencies, "transactionsCurrencies");
                int length = searchQuery.length();
                int i = 0;
                while (true) {
                    if (i >= length) {
                        strSubstring = "";
                    } else if (searchQuery.charAt(i) == '@') {
                        i++;
                    } else {
                        strSubstring = searchQuery.substring(i);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    }
                }
                if (d0.W(strSubstring)) {
                    strSubstring = null;
                }
                Intrinsics.checkNotNullParameter(allowedContactTypes, "allowedContactTypes");
                int i2 = aVar3 == null ? -1 : kn3.c.f185979a[aVar3.ordinal()];
                ContactType.Group group3 = ContactType.Group.f66037a;
                if (i2 != -1) {
                    if (i2 == 1) {
                        List list = allowedContactTypes;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            if (obj3 instanceof ContactType.RevolutContact.Local) {
                                arrayList.add(obj3);
                            }
                        }
                        List listU = zhm.d0.U(arrayList);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : list) {
                            if (obj4 instanceof ContactType.RevolutContact.Remote) {
                                arrayList2.add(obj4);
                            }
                        }
                        listE0 = zhm.d0.E0(zhm.d0.U(arrayList2), listU);
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        listE0 = zhm.v.l(allowedContactTypes.contains(group3) ? group3 : null);
                    }
                    filterContactTypes = listE0;
                } else {
                    filterContactTypes = allowedContactTypes;
                }
                kn3.h hVar = bVar.f185978b;
                Intrinsics.checkNotNullParameter(filterContactTypes, "filterContactTypes");
                Intrinsics.checkNotNullParameter(transactionsCurrencies, "transactionsCurrencies");
                ArrayList arrayList3 = new ArrayList();
                Iterator it8 = filterContactTypes.iterator();
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    ContactType.UsernameContact usernameContact3 = ContactType.UsernameContact.f66040a;
                    boolean z4 = z;
                    ContactType.VirtualContact virtualContact3 = ContactType.VirtualContact.f66041a;
                    Iterator it9 = it8;
                    ContactType$DeviceContact$Email contactType$DeviceContact$Email3 = ContactType$DeviceContact$Email.f66035a;
                    String str2 = strSubstring;
                    ContactType$DeviceContact$Phone contactType$DeviceContact$Phone3 = ContactType$DeviceContact$Phone.f66036a;
                    String str3 = str;
                    ContactType.RevolutContact.Local local = ContactType.RevolutContact.Local.f66038a;
                    if (!zHasNext) {
                        List filterContactTypes2 = filterContactTypes;
                        List filter = zhm.d0.d1(zhm.d0.i1(arrayList3));
                        if (!z4) {
                            usernameContact = usernameContact3;
                            contactType$DeviceContact$Phone = contactType$DeviceContact$Phone3;
                            virtualContact = virtualContact3;
                            contactType$DeviceContact$Email = contactType$DeviceContact$Email3;
                            group = group3;
                            rVarJ = null;
                        } else if (str2 == null || d0.W(str2)) {
                            virtualContact = virtualContact3;
                            group = group3;
                            t3a.h hVar2 = hVar.f185985a;
                            jq9.a juniorIncludingMode = jq9.a.NONE;
                            Intrinsics.checkNotNullParameter(filter, "filter");
                            Intrinsics.checkNotNullParameter(juniorIncludingMode, "juniorIncludingMode");
                            usernameContact = usernameContact3;
                            contactType$DeviceContact$Email = contactType$DeviceContact$Email3;
                            contactType$DeviceContact$Phone = contactType$DeviceContact$Phone3;
                            efm.r rVarDistinctUntilChanged = nim.a.w(u1.d(nim.a.w(hVar2.f267720a.h(new cl3.c[]{cl3.c.ON_REVOLUT}), new szb.g(29)), nim.a.w(xx9.p.c(hVar2.f267721b, false, juniorIncludingMode, 1), new sx8.a(hVar2, 18))), new s78.n(hVar2, filter)).distinctUntilChanged();
                            Intrinsics.h(rVarDistinctUntilChanged);
                            rVarJ = rVarDistinctUntilChanged;
                        } else {
                            virtualContact = virtualContact3;
                            group = group3;
                            efm.r rVarJust = efm.r.just(zi0.c.P(f0.f322471a, false, null, 3));
                            Intrinsics.h(rVarJust);
                            usernameContact = usernameContact3;
                            contactType$DeviceContact$Phone = contactType$DeviceContact$Phone3;
                            contactType$DeviceContact$Email = contactType$DeviceContact$Email3;
                            rVarJ = rVarJust;
                        }
                        if (rVarJ == null) {
                            rVarJ = zi0.c.j(f0.f322471a);
                        }
                        efm.r rVarW = nim.a.w(kli.a.h(rVarJ, ((ik3.c) hVar.f185986b).m()), new g48.h(hVar, z3, transactionsCurrencies, contactsFilter));
                        kn3.f fVar = bVar.f185977a;
                        Intrinsics.checkNotNullParameter(allowedContactTypes, "allowedContactTypes");
                        Intrinsics.checkNotNullParameter(filterContactTypes2, "filterContactTypes");
                        Intrinsics.checkNotNullParameter(transactionsCurrencies, str3);
                        List<ContactType> list2 = allowedContactTypes;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list2, 10));
                        for (ContactType contactType : list2) {
                            if (Intrinsics.f(contactType, local) || (contactType instanceof ContactType.RevolutContact.Remote)) {
                                contactType$DeviceContact$Phone2 = contactType$DeviceContact$Phone;
                                virtualContact2 = virtualContact;
                                group2 = group;
                                contactType$DeviceContact$Email2 = contactType$DeviceContact$Email;
                                usernameContact2 = usernameContact;
                                aVar = d3a.a.REVOLUT;
                            } else {
                                contactType$DeviceContact$Phone2 = contactType$DeviceContact$Phone;
                                if (Intrinsics.f(contactType, contactType$DeviceContact$Phone2)) {
                                    contactType$DeviceContact$Email2 = contactType$DeviceContact$Email;
                                } else {
                                    contactType$DeviceContact$Email2 = contactType$DeviceContact$Email;
                                    if (!Intrinsics.f(contactType, contactType$DeviceContact$Email2)) {
                                        usernameContact2 = usernameContact;
                                        if (Intrinsics.f(contactType, usernameContact2)) {
                                            aVar = d3a.a.REVTAG;
                                            virtualContact2 = virtualContact;
                                        } else {
                                            virtualContact2 = virtualContact;
                                            if (Intrinsics.f(contactType, virtualContact2)) {
                                                aVar = d3a.a.VIRTUAL_CONTACTS;
                                            } else {
                                                group2 = group;
                                                if (!Intrinsics.f(contactType, group2)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                aVar = d3a.a.GROUPS;
                                            }
                                        }
                                        group2 = group;
                                    }
                                }
                                virtualContact2 = virtualContact;
                                group2 = group;
                                usernameContact2 = usernameContact;
                                aVar = d3a.a.DEVICE;
                            }
                            arrayList4.add(aVar);
                            contactType$DeviceContact$Phone = contactType$DeviceContact$Phone2;
                            contactType$DeviceContact$Email = contactType$DeviceContact$Email2;
                            usernameContact = usernameContact2;
                            virtualContact = virtualContact2;
                            group = group2;
                        }
                        efm.r rVarDistinctUntilChanged2 = ((u3a.n) fVar.f185983a).d(str2, zhm.d0.U(zhm.d0.d1(zhm.d0.i1(arrayList4))), jq9.a.NONE).distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
                        return nim.a.w(u1.d(rVarW, nim.a.w(kli.a.h(rVarDistinctUntilChanged2, ((ik3.c) fVar.f185984b).m()), new ael.s(fVar, allowedContactTypes, filterContactTypes2, z3, transactionsCurrencies, contactsFilter))), new k7c.n(str2, 13));
                    }
                    List list3 = filterContactTypes;
                    ContactType contactType2 = (ContactType) it9.next();
                    if (Intrinsics.f(contactType2, local)) {
                        cVar = e3a.c.REVOLUT_CONTACT_LOCAL;
                    } else if (contactType2 instanceof ContactType.RevolutContact.Remote) {
                        cVar = e3a.c.REVOLUT_CONTACT_REMOTE;
                    } else if (Intrinsics.f(contactType2, contactType$DeviceContact$Phone3)) {
                        cVar = e3a.c.DEVICE_CONTACT_PHONE;
                    } else if (Intrinsics.f(contactType2, contactType$DeviceContact$Email3)) {
                        cVar = e3a.c.DEVICE_CONTACT_EMAIL;
                    } else if (Intrinsics.f(contactType2, group3)) {
                        cVar = e3a.c.GROUP;
                    } else {
                        if (!Intrinsics.f(contactType2, virtualContact3) && !Intrinsics.f(contactType2, usernameContact3)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar = null;
                    }
                    if (cVar != null) {
                        arrayList3.add(cVar);
                    }
                    z = z4;
                    it8 = it9;
                    strSubstring = str2;
                    str = str3;
                    filterContactTypes = list3;
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                com.revolut.feature.contacts_chooser.impl.ui.a aVar4 = this.f217462b;
                aVar4.H2(aVar4.A, new lph.c(zBooleanValue, 21));
                ihm.b bVar2 = aVar4.f66095y;
                Unit unit = Unit.f186387a;
                bVar2.onNext(unit);
                return unit;
        }
    }
}
