package ibd;

import java.io.Serializable;
import org.joda.time.LocalDate;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes7.dex */
public interface i extends Serializable {
    Period L();

    LocalDate Q();

    String getId();

    Boolean getRecurring();

    h getType();

    LocalDate n2();
}
