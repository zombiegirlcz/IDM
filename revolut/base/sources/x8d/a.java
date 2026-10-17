package x8d;

import com.revolut.chat.domain.model.NewTicketContext;
import com.revolut.core.model.faq.FaqNodeBase;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends cki.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: x8d.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1686a {

        /* JADX INFO: renamed from: x8d.a$a$a, reason: collision with other inner class name */
        public static final class C1687a extends AbstractC1686a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1687a f303313a = new C1687a();

            private C1687a() {
            }
        }

        /* JADX INFO: renamed from: x8d.a$a$b */
        public static final class b extends AbstractC1686a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f303314a = new b();

            private b() {
            }
        }

        private AbstractC1686a() {
        }
    }

    public static final class b {
        private b() {
        }
    }

    public abstract void e3(FaqNodeBase faqNodeBase, NewTicketContext newTicketContext);

    public abstract void f3(String str);

    public abstract void g3(FaqNodeBase faqNodeBase);
}
