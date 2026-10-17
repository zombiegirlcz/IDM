package n14;

import dx4.a1;
import dx4.y0;
import java.util.ArrayList;
import java.util.List;
import k14.a;
import k14.b;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public abstract class g {
    public static final av3.f a(k14.a aVar) {
        av3.b bVar;
        av3.c cVar;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        boolean ableToSkipLinkingProcess = aVar.getAbleToSkipLinkingProcess();
        a.c introScreen = aVar.getIntroScreen();
        Intrinsics.checkNotNullParameter(introScreen, "<this>");
        String title = introScreen.getTitle();
        String description = introScreen.getDescription();
        String buttonTitle = introScreen.getButtonTitle();
        String secondaryButtonTitle = introScreen.getSecondaryButtonTitle();
        a.C1027a secondaryButtonActionPopup = introScreen.getSecondaryButtonActionPopup();
        if (secondaryButtonActionPopup != null) {
            Intrinsics.checkNotNullParameter(secondaryButtonActionPopup, "<this>");
            bVar = new av3.b(secondaryButtonActionPopup.getTitle(), secondaryButtonActionPopup.getDescription(), secondaryButtonActionPopup.getPrimaryButtonTitle(), secondaryButtonActionPopup.getSecondaryButtonTitle());
        } else {
            bVar = null;
        }
        a.b infoPopup = introScreen.getInfoPopup();
        if (infoPopup != null) {
            Intrinsics.checkNotNullParameter(infoPopup, "<this>");
            cVar = new av3.c(infoPopup.getLabel(), infoPopup.getTitle(), infoPopup.getDescription(), infoPopup.getButtonTitle());
        } else {
            cVar = null;
        }
        av3.d dVar = new av3.d(title, description, introScreen.getFooter(), introScreen.getImage(), buttonTitle, secondaryButtonTitle, bVar, cVar);
        a.d bankSelectionScreen = aVar.getBankSelectionScreen();
        av3.e eVar = bankSelectionScreen != null ? new av3.e(bankSelectionScreen.getTitle(), bankSelectionScreen.getSubtitle()) : null;
        a.d accountsScreen = aVar.getAccountsScreen();
        return new av3.f(ableToSkipLinkingProcess, dVar, eVar, accountsScreen != null ? new av3.e(accountsScreen.getTitle(), accountsScreen.getSubtitle()) : null);
    }

    public static final av3.h b(k14.b bVar) {
        ArrayList arrayList;
        a1 a1VarA;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String title = bVar.getTitle();
        String description = bVar.getDescription();
        String buttonTitle = bVar.getButtonTitle();
        String disclaimer = bVar.getDisclaimer();
        List items = bVar.getItems();
        if (items != null) {
            List<b.a> list = items;
            arrayList = new ArrayList(w.t(list, 10));
            for (b.a aVar : list) {
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                String title2 = aVar.getTitle();
                String description2 = aVar.getDescription();
                if (aVar.getIcon() != null) {
                    y0 y0Var = a1.Companion;
                    String icon = aVar.getIcon();
                    y0Var.getClass();
                    a1VarA = y0.a(icon);
                } else {
                    a1VarA = null;
                }
                arrayList.add(new av3.g(a1VarA, title2, description2));
            }
        } else {
            arrayList = null;
        }
        return new av3.h(title, description, buttonTitle, disclaimer, arrayList);
    }
}
