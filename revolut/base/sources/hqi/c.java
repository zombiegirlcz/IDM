package hqi;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.stories.StoryPagesView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f154706b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f154705a = i;
        this.f154706b = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f154705a) {
            case 0:
                ((f) this.f154706b).k.onNext(new Object());
                break;
            case 1:
                Function0 function0 = (Function0) this.f154706b;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 2:
                ((StoryPagesView) this.f154706b).D.invoke();
                break;
            default:
                ((ypi.e) this.f154706b).f315919l.onNext(Unit.f186387a);
                break;
        }
    }
}
