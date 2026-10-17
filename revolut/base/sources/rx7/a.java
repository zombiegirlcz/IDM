package rx7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_pet.impl.R$string;
import java.util.ArrayList;
import rp0.t;
import rp0.y;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ os2.g f258060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f258061c;

    public /* synthetic */ a(os2.g gVar, ArrayList arrayList, int i) {
        this.f258059a = i;
        this.f258060b = gVar;
        this.f258061c = arrayList;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f258059a) {
            case 0:
                opi.d dVar = (opi.d) this.f258060b.f229224b;
                rp0.l lVar = rp0.l.WINDOW;
                opi.b bVar = (opi.b) dVar;
                bVar.Z(new y(this.f258061c, new t(new TextLocalisedClause(R$string.pets_onboarding_pet_details_size_title, null, null, 14), new TextLocalisedClause(R$string.pets_onboarding_pet_details_size_caption, null, null, 14), null, 28), lVar, null, null, null, "BREED_SELECTION_DIALOG_DELEGATE_KEY", null, null, null, 3832));
                break;
            default:
                opi.d dVar2 = (opi.d) this.f258060b.f229224b;
                rp0.l lVar2 = rp0.l.WINDOW;
                opi.b bVar2 = (opi.b) dVar2;
                bVar2.Z(new y(this.f258061c, new t(new TextLocalisedClause(R$string.pets_onboarding_pet_details_breed_type_title, null, null, 14), new TextLocalisedClause(R$string.pets_onboarding_pet_details_breed_type_caption, null, null, 14), null, 28), lVar2, null, null, null, "BREED_SELECTION_DIALOG_DELEGATE_KEY", null, null, null, 3832));
                break;
        }
    }
}
