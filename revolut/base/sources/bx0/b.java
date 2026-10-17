package bx0;

import android.view.View;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.storiesdelegates.BaseStoriesDelegate;
import com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ConfigurableResourceImage;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19395c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f19393a = i;
        this.f19394b = obj2;
        this.f19395c = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        py0.d bVar;
        switch (this.f19393a) {
            case 0:
                ((BaseStoriesDelegate) this.f19394b).f58175c.invoke((BaseStoriesModel) this.f19395c);
                break;
            case 1:
                ((BaseStoriesDelegate) this.f19394b).f58175c.invoke((BaseStoriesModel) this.f19395c);
                break;
            case 2:
                ((BaseStoriesDelegate) this.f19394b).d.invoke((BaseStoriesModel) this.f19395c);
                break;
            case 3:
                ((BaseStoriesDelegate) this.f19394b).d.invoke((BaseStoriesModel) this.f19395c);
                break;
            case 4:
                ((BaseStoriesDelegate) this.f19394b).f58175c.invoke((BaseStoriesModel) this.f19395c);
                break;
            case 5:
                ((BaseStoriesDelegate) this.f19394b).d.invoke((BaseStoriesModel) this.f19395c);
                break;
            default:
                LargeActionButton largeActionButton = (LargeActionButton) this.f19394b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.f19395c;
                largeActionButton.A.b0();
                LargeActionButton.CenterIcon f58748t = largeActionButton.f58720s.getF58748t();
                Integer numValueOf = f58748t != null ? Integer.valueOf(f58748t.getF58749a()) : null;
                Clause clause = largeActionButton.f58717p;
                if (clause != null) {
                    bVar = new py0.c(clause);
                } else {
                    Image image = largeActionButton.f58718q;
                    if (image != null) {
                        bVar = new py0.b(image);
                    } else {
                        bVar = numValueOf != null ? new py0.b(new ConfigurableResourceImage(numValueOf.intValue(), null, null, null, 1022)) : null;
                    }
                }
                or0.u.k(largeActionButton).n0().a(largeActionButton, largeActionButton, bVar);
                largeActionButton.o.onNext(Unit.f186387a);
                onClickListener.onClick(view);
                break;
        }
    }
}
