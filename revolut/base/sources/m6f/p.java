package m6f;

import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface p {

    @NotNull
    public static final n Companion = n.f203075a;

    BigDecimal getAllocation();

    List getItems();

    boolean isExpanded();
}
