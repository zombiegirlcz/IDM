package ar6;

import akl.t;
import com.revolut.feature.form_wizard.impl.network.services.FormWizardService;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t90.g;
import w4l.f;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FormWizardService f8523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f8524b;

    public c(FormWizardService formWizardService, g backendFlowMapper, yq6.a formWizardMapper) {
        Intrinsics.checkNotNullParameter(formWizardService, "formWizardService");
        Intrinsics.checkNotNullParameter(backendFlowMapper, "backendFlowMapper");
        Intrinsics.checkNotNullParameter(formWizardMapper, "formWizardMapper");
        this.f8523a = formWizardService;
        this.f8524b = backendFlowMapper;
        new f(new t(this, 1), null, null, null, null, null, null, null, 254);
    }

    public static String a(String str, Map map) {
        List list = (List) map.get(str);
        if (list != null) {
            return (String) d0.d0(list);
        }
        return null;
    }
}
