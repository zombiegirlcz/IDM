package i6g;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.feature.travel.flights.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, c4g.j.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/travel/flights/impl/databinding/ScreenTravelFlightsLocationPickerBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.travelFlightsLocationPicker_closeButton;
        FormsActionButton formsActionButton = (FormsActionButton) ViewBindings.findChildViewById(p0, i);
        if (formsActionButton != null) {
            ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) p0;
            int i2 = R$id.travelFlightsLocationPicker_recyclerView;
            if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i2)) != null) {
                i2 = R$id.travelFlightsLocationPicker_searchInput;
                InputText inputText = (InputText) ViewBindings.findChildViewById(p0, i2);
                if (inputText != null) {
                    return new c4g.j(controllerContainerConstraintLayout, formsActionButton, inputText);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
