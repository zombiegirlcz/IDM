package kog;

import android.os.Parcelable;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.PersonsListScreenContract$DomainState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        PersonsListScreenContract$DomainState currentState = (PersonsListScreenContract$DomainState) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return currentState;
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        PersonsListScreenContract$DomainState initialState = (PersonsListScreenContract$DomainState) obj2;
        PersonsListScreenContract$DomainState retainedState = (PersonsListScreenContract$DomainState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return retainedState;
    }
}
