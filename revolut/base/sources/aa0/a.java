package aa0;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.backend_flow.domain.models.AddressInputItem;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends c {
    @Override // aa0.c
    public final InputItem a(InputItem inputItem, Object obj2) {
        AddressInputItem targetItem = (AddressInputItem) inputItem;
        Address updatedValue = (Address) obj2;
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
        if (Intrinsics.f(updatedValue, Address.INSTANCE.getEMPTY())) {
            updatedValue = null;
        }
        Address address = updatedValue;
        String id10 = targetItem.f63233a;
        boolean z = targetItem.f63234b;
        AddressInputItem.CountrySelector countrySelector = targetItem.f63235c;
        String str = targetItem.e;
        String str2 = targetItem.f;
        String str3 = targetItem.f63236g;
        String str4 = targetItem.f63237h;
        String str5 = targetItem.i;
        String str6 = targetItem.f63238j;
        String str7 = targetItem.k;
        String str8 = targetItem.f63239l;
        String str9 = targetItem.f63240m;
        String str10 = targetItem.f63241n;
        String str11 = targetItem.o;
        String str12 = targetItem.f63242p;
        String str13 = targetItem.f63243q;
        String str14 = targetItem.f63244r;
        String str15 = targetItem.f63245s;
        String str16 = targetItem.f63246t;
        String str17 = targetItem.u;
        String str18 = targetItem.v;
        String str19 = targetItem.f63247w;
        String str20 = targetItem.f63248x;
        String str21 = targetItem.f63249y;
        String str22 = targetItem.z;
        String str23 = targetItem.A;
        String str24 = targetItem.B;
        String str25 = targetItem.C;
        String str26 = targetItem.D;
        String str27 = targetItem.E;
        String str28 = targetItem.F;
        String str29 = targetItem.G;
        String str30 = targetItem.H;
        String str31 = targetItem.I;
        String str32 = targetItem.J;
        String str33 = targetItem.K;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(countrySelector, "countrySelector");
        return new AddressInputItem(id10, z, countrySelector, address, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33);
    }
}
