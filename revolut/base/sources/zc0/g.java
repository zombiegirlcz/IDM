package zc0;

import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.ChipsSelectionItem;
import com.revolut.feature.backend_flow.domain.models.CurrencySelectionOption;
import com.revolut.feature.backend_flow.domain.models.FiltersInputItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.SelectedTransaction;
import com.revolut.feature.backend_flow.domain.models.SelectionItem;
import java.time.LocalDate;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface g {
    pfm.a A2(String str, LocalDate localDate);

    ihm.f B2();

    pfm.a C2(String str, String str2);

    ihm.f G2();

    pfm.a H(String str, CurrencySelectionOption currencySelectionOption);

    void I1(String str);

    pfm.a K2(int i, String str);

    default String L0() {
        return null;
    }

    pfm.a N(SelectedTransaction selectedTransaction);

    pfm.a N0(String str, xl2.r rVar);

    void Q();

    pfm.a Q2(String str, String str2);

    v60.i R();

    pfm.a R0(String str, String str2);

    void U1(String str);

    pfm.a V1(String str, aa0.h1 h1Var);

    pfm.a W1(String str, String str2);

    pfm.a X0(String str, String str2);

    efm.r X2();

    pfm.a Y0(String str, boolean z);

    pfm.a a0(xu.i iVar);

    String b();

    pfm.a b1(String str);

    pfm.a b2(String str, LocalDate localDate);

    pfm.f b3(List list);

    pfm.a c2(String str);

    pfm.a d3(String str, String str2);

    String e();

    FormScreen e0();

    void e1(String str);

    pfm.a e3(String str, FiltersInputItem.Option option);

    efm.r f1();

    pfm.a f3(String str, ChipsSelectionItem.Chip chip);

    String g();

    pfm.h h2();

    void h3(String str);

    String i();

    pfm.a j2(SelectionItem selectionItem, String str);

    void k0();

    pfm.a m1(String str, String str2);

    efm.r n();

    efm.r n1();

    pfm.a n2(String str);

    pfm.a p0(String str, ba0.j jVar);

    efm.r q2();

    pfm.a s(BackendScreen backendScreen);

    pfm.a t(String str, boolean z);

    void t0(long j2);

    boolean u2();

    pfm.a v1(String str, String str2);

    pfm.a w(String str);

    sfm.b w0();

    pfm.a x0(String str, LocalDate localDate);

    pfm.a y2(String str);

    void z0();
}
