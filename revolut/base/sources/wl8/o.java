package wl8;

import android.os.Parcelable;
import com.revolut.data.model.Data;
import com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.JuniorContactPickerScreenContract$RetainedState;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        g currentState = (g) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new JuniorContactPickerScreenContract$RetainedState(currentState.f298446a, (List) currentState.f298447b.getContent(), (List) currentState.f298448c.getContent(), currentState.d, currentState.e);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        g initialState = (g) obj2;
        JuniorContactPickerScreenContract$RetainedState retainedState = (JuniorContactPickerScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        String searchQuery = retainedState.f77215a;
        Data suggestedContacts = new Data(retainedState.f77216b, initialState.f298447b.getError(), initialState.f298447b.getLoading());
        List list = retainedState.f77217c;
        Data data = initialState.f298448c;
        Data searchContacts = new Data(list, data.getError(), data.getLoading());
        zm3.f fVar = retainedState.d;
        zm3.f fVar2 = retainedState.e;
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(suggestedContacts, "suggestedContacts");
        Intrinsics.checkNotNullParameter(searchContacts, "searchContacts");
        return new g(searchQuery, suggestedContacts, searchContacts, fVar, fVar2);
    }
}
