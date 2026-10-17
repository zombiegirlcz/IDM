package org.tensorflow.lite.support.common;

import org.tensorflow.lite.support.common.SequentialProcessor;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

/* JADX INFO: loaded from: classes14.dex */
public class TensorProcessor extends SequentialProcessor<TensorBuffer> {

    public static class Builder extends SequentialProcessor.Builder<TensorBuffer> {
        @Override // org.tensorflow.lite.support.common.SequentialProcessor.Builder
        public /* bridge */ /* synthetic */ SequentialProcessor.Builder<TensorBuffer> add(Operator<TensorBuffer> operator) {
            return super.add(operator);
        }

        public Builder add(TensorOperator tensorOperator) {
            super.add((Operator) tensorOperator);
            return this;
        }

        @Override // org.tensorflow.lite.support.common.SequentialProcessor.Builder
        public SequentialProcessor<TensorBuffer> build() {
            return new TensorProcessor(this);
        }
    }

    private TensorProcessor(Builder builder) {
        super(builder);
    }
}
