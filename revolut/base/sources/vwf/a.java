package vwf;

import com.revolut.data.model.Data;
import com.revolut.feature.transport.models.fields.TransportCheckoutDropdownField;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nvf.i;
import s7a.c0;
import vh2.o;
import vkm.v1;
import vv7.l;
import vw4.j;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends x7a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f292712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransportCheckoutDropdownField f292713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f292714c;

    public a(i transportCheckoutFieldMapper, TransportCheckoutDropdownField field, String str) {
        Intrinsics.checkNotNullParameter(transportCheckoutFieldMapper, "transportCheckoutFieldMapper");
        Intrinsics.checkNotNullParameter(field, "field");
        this.f292712a = transportCheckoutFieldMapper;
        this.f292713b = field;
        this.f292714c = str;
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        String str = (String) d0.c0(ids);
        Object obj3 = null;
        String strE0 = str != null ? kotlin.text.d0.e0(str, "ID_DROPDOWN_") : null;
        Iterator it8 = this.f292713b.f92617g.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (Intrinsics.f(((TransportCheckoutDropdownField.Option) next).f92618a, strE0)) {
                obj3 = next;
                break;
            }
        }
        TransportCheckoutDropdownField.Option option = (TransportCheckoutDropdownField.Option) obj3;
        return option != null ? new c(option) : b.f292715a;
    }

    @Override // x7a.d
    public final List d(Data data, Set selectedModelIds, List list, String query, Object obj2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.checkNotNullParameter(query, "query");
        return (List) iii.c.f(data, new j(3), new l(8), new o(query, this, 7));
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(query, "query");
        return new v1(new vnl.o(this, null, 13));
    }
}
