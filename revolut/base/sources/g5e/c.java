package g5e;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_note.AboutNoteScreen;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_note.AboutNoteScreenContract$ModalStep;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_note_glossary.AboutNoteGlossaryScreenContract$Category;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AboutNoteScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AboutNoteScreen aboutNoteScreen, Continuation continuation) {
        super(2, continuation);
        this.v = aboutNoteScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.P.getValue();
        Intrinsics.h(model);
        com.revolut.feature.structured_note.details.impl.ui.screens.about_note.a aVar2 = (com.revolut.feature.structured_note.details.impl.ui.screens.about_note.a) eVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f52715m;
        AboutNoteGlossaryScreenContract$Category aboutNoteGlossaryScreenContract$Category = obj3 instanceof AboutNoteGlossaryScreenContract$Category ? (AboutNoteGlossaryScreenContract$Category) obj3 : null;
        if (aboutNoteGlossaryScreenContract$Category != null) {
            oki.h.v2(aVar2.f88885s, new AboutNoteScreenContract$ModalStep.Glossary(aboutNoteGlossaryScreenContract$Category), ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}
