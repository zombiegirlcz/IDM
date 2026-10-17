package swf;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.transport.models.fields.TransportCheckoutField;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.StateFlow;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b extends n {
    public abstract StateFlow Z2();

    public abstract void b3(LocalDate localDate, TransportCheckoutField transportCheckoutField);

    public abstract void c3(TransportCheckoutField transportCheckoutField, String str);

    public abstract void d3(SelectableDelegate.Model model);

    public abstract void e3(InputTextDelegate.TextData textData);

    public abstract void f3(ruf.e eVar);

    public abstract void g3(LocalTime localTime, TransportCheckoutField transportCheckoutField);

    public abstract void h3(TransportCheckoutField transportCheckoutField);

    public abstract void i3(List list, Map map);
}
