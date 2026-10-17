package t04;

import dx4.a1;
import dx4.y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dr3.g f266904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f266905b;

    public o(dr3.g creditPromptContentDtoMapper, p formMapper) {
        Intrinsics.checkNotNullParameter(creditPromptContentDtoMapper, "creditPromptContentDtoMapper");
        Intrinsics.checkNotNullParameter(formMapper, "formMapper");
        this.f266904a = creditPromptContentDtoMapper;
        this.f266905b = formMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    public final my3.f a(j dto) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(dto, "dto");
        String title = dto.getTitle();
        String subtitle = dto.getSubtitle();
        String continueButton = dto.getContinueButton();
        a addDebtItem = dto.getAddDebtItem();
        y0 y0Var = a1.Companion;
        String image = addDebtItem.getImage();
        y0Var.getClass();
        my3.d dVar = new my3.d(y0.a(image), addDebtItem.getTitle(), addDebtItem.getDescription());
        List debts = dto.getDebts();
        if (debts != null) {
            List<g> list = debts;
            arrayList = new ArrayList(w.t(list, 10));
            for (g gVar : list) {
                String id10 = gVar.getId();
                String title2 = gVar.getTitle();
                String description = gVar.getDescription();
                y0 y0Var2 = a1.Companion;
                String image2 = gVar.getImage();
                y0Var2.getClass();
                a1 a1VarA = y0.a(image2);
                String value = gVar.getValue();
                String valueDescription = gVar.getValueDescription();
                r form = gVar.getForm();
                arrayList.add(new my3.e(id10, title2, description, a1VarA, value, valueDescription, form != null ? this.f266905b.a(form) : null));
            }
        } else {
            arrayList = f0.f322471a;
        }
        return new my3.f(title, subtitle, continueButton, dVar, arrayList);
    }
}
