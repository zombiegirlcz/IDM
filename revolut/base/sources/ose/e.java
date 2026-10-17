package ose;

import com.revolut.data.model.Data;
import com.revolut.feature.feedback.api.domain.Feedback;
import com.revolut.feature.tickets.api.models.TicketDetails;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface e {

    @NotNull
    public static final a Companion = a.f229320a;

    List a();

    List b(TicketDetails ticketDetails, Feedback feedback, d dVar, boolean z);

    List c(Data data, TicketDetails ticketDetails, Feedback feedback, c cVar);
}
