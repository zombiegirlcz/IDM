// Who is responsible for engine/target/release/idm-host being there.
//
// `npm test` compiles no Rust unless WITH_RUST=1 (see scripts/test.sh), so a
// missing release binary means two different things: with the flag, the build
// step ran and failed to produce it — a failure; without it, nobody ever asked
// for a binary — nothing to check.

export const BUILD_HINT = 'build it first: (cd engine && cargo build --release)';

export function releaseHostMode({ exists, withRust }) {
  if (exists) return { mode: 'run', reason: '' };
  if (withRust) return { mode: 'fail', reason: 'release host binary missing. ' + BUILD_HINT };
  return {
    mode: 'skip',
    reason: 'no release binary and this run builds no Rust (set WITH_RUST=1 to build and check it)',
  };
}
