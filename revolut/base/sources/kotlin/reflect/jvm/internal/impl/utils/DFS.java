package kotlin.reflect.jvm.internal.impl.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public class DFS {

    public static abstract class AbstractNodeHandler<N, R> implements NodeHandler<N, R> {
        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        public void afterChildren(N n3) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        public boolean beforeChildren(N n3) {
            return true;
        }
    }

    public static abstract class CollectingNodeHandler<N, R, C extends Iterable<R>> extends AbstractNodeHandler<N, C> {
        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        @NotNull
        public C result() {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/utils/DFS$CollectingNodeHandler", "result"));
        }
    }

    public interface Neighbors<N> {
        @NotNull
        Iterable<? extends N> getNeighbors(N n3);
    }

    public interface NodeHandler<N, R> {
        void afterChildren(N n3);

        boolean beforeChildren(N n3);

        R result();
    }

    public static abstract class NodeHandlerWithListResult<N, R> extends CollectingNodeHandler<N, R, LinkedList<R>> {
    }

    public interface Visited<N> {
        boolean checkAndMarkVisited(N n3);
    }

    public static class VisitedWithSet<N> implements Visited<N> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f187878a;

        public VisitedWithSet() {
            this(new HashSet());
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Visited
        public boolean checkAndMarkVisited(N n3) {
            return this.f187878a.add(n3);
        }

        public VisitedWithSet(@NotNull Set<N> set) {
            if (set == null) {
                throw new IllegalArgumentException("Argument for @NotNull parameter 'visited' of kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet.<init> must not be null");
            }
            this.f187878a = set;
        }
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static <N, R> R dfs(@NotNull Collection<N> collection, @NotNull Neighbors<N> neighbors, @NotNull Visited<N> visited, @NotNull NodeHandler<N, R> nodeHandler) {
        if (collection == null) {
            a(0);
            throw null;
        }
        if (neighbors == null) {
            a(1);
            throw null;
        }
        if (visited == null) {
            a(2);
            throw null;
        }
        if (nodeHandler == null) {
            a(3);
            throw null;
        }
        Iterator<N> it8 = collection.iterator();
        while (it8.hasNext()) {
            doDfs(it8.next(), neighbors, visited, nodeHandler);
        }
        return nodeHandler.result();
    }

    public static <N> void doDfs(@NotNull N n3, @NotNull Neighbors<N> neighbors, @NotNull Visited<N> visited, @NotNull NodeHandler<N, ?> nodeHandler) {
        if (n3 == null) {
            a(22);
            throw null;
        }
        if (neighbors == null) {
            a(23);
            throw null;
        }
        if (visited == null) {
            a(24);
            throw null;
        }
        if (nodeHandler == null) {
            a(25);
            throw null;
        }
        if (visited.checkAndMarkVisited(n3) && nodeHandler.beforeChildren(n3)) {
            Iterator<? extends N> it8 = neighbors.getNeighbors(n3).iterator();
            while (it8.hasNext()) {
                doDfs(it8.next(), neighbors, visited, nodeHandler);
            }
            nodeHandler.afterChildren(n3);
        }
    }

    public static <N> Boolean ifAny(@NotNull Collection<N> collection, @NotNull Neighbors<N> neighbors, @NotNull Function1<N, Boolean> function1) {
        if (collection == null) {
            a(7);
            throw null;
        }
        if (neighbors == null) {
            a(8);
            throw null;
        }
        if (function1 != null) {
            return (Boolean) dfs(collection, neighbors, new a(function1, new boolean[1]));
        }
        a(9);
        throw null;
    }

    public static <N, R> R dfs(@NotNull Collection<N> collection, @NotNull Neighbors<N> neighbors, @NotNull NodeHandler<N, R> nodeHandler) {
        if (collection == null) {
            a(4);
            throw null;
        }
        if (neighbors == null) {
            a(5);
            throw null;
        }
        if (nodeHandler != null) {
            return (R) dfs(collection, neighbors, new VisitedWithSet(), nodeHandler);
        }
        a(6);
        throw null;
    }
}
