package j28;

import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public interface e {

    @NotNull
    public static final d Companion = d.f170723a;

    int a();

    Flow b(InvestWidgetContext investWidgetContext, String str);

    Object c(String str, Continuation continuation);
}
